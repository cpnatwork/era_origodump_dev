/*
 * NAME: era.foss.model.core.test.IdentifiableTest
 */

package era.foss.model.core.test;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.core.model.Model;
import era.foss.model.rif.RifFactory;
import era.foss.model.rif.model.Rif;
import era.foss.model.rif.model.RifSpecObjects;
import era.foss.model.rif.model.SpecHierarchy;
import era.foss.model.rif.model.SpecHierarchyRoot;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.Type;
import era.internal.testlib.AbstractTest;

/**
 * 
 * @author poldi
 */
public class IdentifiableTest extends AbstractTest {

    /**
     * 
     * @since Jun 20, 2009
     */
    public IdentifiableTest() {
        super();

    }

    @Test
    public void testIdentifiable() {
        Rif rif = RifFactory.eINSTANCE.createRif();
        assertFalse( rif.isIdentifiable() );
        SpecObject specObject = RifFactory.eINSTANCE.createSpecObject();
        assertTrue( specObject.isIdentifiable() );
        Type specObjectType = RifFactory.eINSTANCE.createType();
        assertFalse( specObjectType.isIdentifiable() );
        System.out.println( getTestStream( "My2.rif" ) );
    }
    
    @Test
    public void testNotify() throws Exception {
        // Get file
        IProject project = createProject( "TestProject" );
        IFile file = project.getFile( new Path( "TempRif.xml" ) );
        
        // Get rif
        AbstractDocument document = Model.getInstance().createUserDocument( file );
        Rif rif = document.getRif();
        
        // roots
        rif.setSpecHierarchyRoots( RifFactory.eINSTANCE.createRifSpecHierarchyRoots() );
        EList<SpecHierarchyRoot> roots = rif.getSpecHierarchyRoots().getSpecHierarchyRoot();
        
        // root
        SpecHierarchyRoot root = RifFactory.eINSTANCE.createSpecHierarchyRoot();
        root.setIdentifier( "SpecHierarchyRootIdentifier" );
        assertNull( document.getById( "SpecHierarchyRootIdentifier", SpecHierarchyRoot.class ) );         
        roots.add( root );
        assertEquals( root, document.getById( "SpecHierarchyRootIdentifier", SpecHierarchyRoot.class ) );
        
        // SpecHierarchy
        SpecHierarchy specHierarchy = RifFactory.eINSTANCE.createSpecHierarchy();
        specHierarchy.setIdentifier( "SpecHierarchyIdentifier" );
        assertNull( document.getById( "SpecHierarchyIdentifier", SpecHierarchy.class ) );
        root.setChildren( RifFactory.eINSTANCE.createSpecHierarchyRootChildren() );
        root.getChildren().getSpecHierarchy().add( specHierarchy );
        assertEquals( specHierarchy, document.getById( "SpecHierarchyIdentifier", SpecHierarchy.class ) );
        
        // SpecHierarchyChildren
        specHierarchy.setChildren( RifFactory.eINSTANCE.createSpecHierarchyChildren() );
        EList<SpecHierarchy> children = specHierarchy.getChildren().getSpecHierarchy();        
        SpecHierarchy specHierarchyChild = RifFactory.eINSTANCE.createSpecHierarchy();        
        specHierarchyChild.setIdentifier( "SpecHierarchyChildIdentifier" );
        assertNull( document.getById( "SpecHierarchyChildIdentifier", SpecHierarchy.class ) );
        children.add( specHierarchyChild );
        assertEquals( specHierarchyChild, document.getById( "SpecHierarchyChildIdentifier", SpecHierarchy.class ) );
        
        // Remove child
        children.remove( specHierarchyChild );
        assertNull( document.getById( "SpecHierarchyChildIdentifier", SpecHierarchy.class ) );
        
        // Rename hierarchy
        specHierarchy.setIdentifier( "OtherSpecHierarchyIdentifier" );
        assertEquals( specHierarchy, document.getById( "OtherSpecHierarchyIdentifier", SpecHierarchy.class ) );
        
        // Remove document
        Model.getInstance().closeUserDocument( document );
    }
    
    @Test
    public void testLoadRif() throws Exception {
        // Get file
        IProject project = createProject( "TestProject" );
        IFile file = project.getFile( new Path( "TempRif.xml" ) );
        InputStream is = getTestStream( "My2.rif" );
        file.create( is, true, new NullProgressMonitor() );
        file.getContents();
                
        // Get rif
        AbstractDocument document = Model.getInstance().openUserDocument( file, new NullProgressMonitor(), null );
        Rif rif = document.getRif();
        assertNotNull( rif );
        RifSpecObjects specObjects = rif.getSpecObjects();
        assertNotNull( specObjects );
        EList<SpecObject> specObjectList = specObjects.getSpecObject();
        assertTrue( specObjectList.iterator().hasNext() );
    }

} // IdentifiableTest
