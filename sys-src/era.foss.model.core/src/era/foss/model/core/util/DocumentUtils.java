package era.foss.model.core.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.eclipse.emf.ecore.EReference;

import era.foss.model.core.model.AbstractDocument;
import era.foss.model.rif.RifFactory;
import era.foss.model.rif.RifPackage;
import era.foss.model.rif.era.IERAObject;
import era.foss.model.rif.model.Identifiable;
import era.foss.model.rif.model.RifSpecGroups;
import era.foss.model.rif.model.RifSpecHierarchyRoots;
import era.foss.model.rif.model.RifSpecObjects;
import era.foss.model.rif.model.RifSpecRelations;
import era.foss.model.rif.model.SpecElementWithUserDefinedAttributes;
import era.foss.model.rif.model.SpecGroup;
import era.foss.model.rif.model.SpecHierarchyRoot;
import era.foss.model.rif.model.SpecObject;
import era.foss.model.rif.model.SpecRelation;
import era.foss.model.rif.model.SpecType;
import era.foss.model.rif.model.Type;


public class DocumentUtils {
    
    /**
     * Create the reference object if it does not exist.
     * 
     * This makes only sense for to 1 refs.
     * 
     * @param object The referencing object
     * @param ref the reference
     * @return the referenced object
     */
    public static IERAObject createReference( IERAObject object, EReference ref ) {
        Object o = object.eGet( ref );
        if( o instanceof IERAObject ) return (IERAObject)o;
        object.eSet( ref, RifFactory.eINSTANCE.create( ref.getEReferenceType() ) );
        return (IERAObject)object.eGet( ref );
    }
    
    public static void initIdentifiable( AbstractDocument document, Identifiable object ) {
        object.setIdentifier( document.createId() );
        object.setDesc( "" );
        object.setLongName( "" );
        try {
            object.setLastChange( DatatypeFactory.newInstance().newXMLGregorianCalendar() );
        } catch( DatatypeConfigurationException e ) {
        }
    }
    
    public static void initTypedObject( AbstractDocument document, SpecElementWithUserDefinedAttributes object, String typeId ) {
        initIdentifiable( document, object );
        Type t = (Type)createReference( object, RifPackage.eINSTANCE.getSpecElementWithUserDefinedAttributes_Type() );
        t.setSpecTypeRef( typeId );
        
    }
    
    public static List<SpecGroup> getSpecGroupsByType( AbstractDocument document, String typeId ) {
        FilterByType<SpecGroup> f = new FilterByType<SpecGroup>();
        RifSpecGroups o = (RifSpecGroups)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecGroups() );
        return f.filter( document, typeId, o.getSpecGroup() );
    }
    
    public static SpecGroup createSpecGroupWithType( AbstractDocument document, String typeId ) {
        RifSpecGroups os = (RifSpecGroups)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecGroups() );
        SpecGroup o = RifFactory.eINSTANCE.createSpecGroup();
        initTypedObject( document, o, typeId );
        os.getSpecGroup().add( o );
        
        return o;
    }
    
    public static List<SpecObject> getSpecObjectsByType( AbstractDocument document, String typeId ) {
        FilterByType<SpecObject> f = new FilterByType<SpecObject>();
        RifSpecObjects o = (RifSpecObjects)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecObjects() );
        return f.filter( document, typeId, o.getSpecObject() );
    }

    public static SpecObject createSpecObjectWithType( AbstractDocument document, String typeId ) {
        RifSpecObjects os = (RifSpecObjects)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecObjects() );
        SpecObject o = RifFactory.eINSTANCE.createSpecObject();
        initTypedObject( document, o, typeId );
        os.getSpecObject().add( o );
        
        return o;
    }

    public static List<SpecRelation> getSpecRelationsByType( AbstractDocument document, String typeId ) {
        FilterByType<SpecRelation> f = new FilterByType<SpecRelation>();
        RifSpecRelations o = (RifSpecRelations)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecRelations() );
        return f.filter( document, typeId, o.getSpecRelation() );
    }
    
    public static SpecRelation createSpecRelationWithType( AbstractDocument document, String typeId ) {
        RifSpecRelations os = (RifSpecRelations)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecRelations() );
        SpecRelation o = RifFactory.eINSTANCE.createSpecRelation();
        initTypedObject( document, o, typeId );
        os.getSpecRelation().add( o );
        
        return o;
    }
    
    public static List<SpecHierarchyRoot> getSpecHierarchyRootsByType( AbstractDocument document, String typeId ) {
        FilterByType<SpecHierarchyRoot> f = new FilterByType<SpecHierarchyRoot>();
        RifSpecHierarchyRoots o = (RifSpecHierarchyRoots)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecHierarchyRoots() );
        return f.filter( document, typeId, o.getSpecHierarchyRoot() );
    }
    
    public static SpecHierarchyRoot createSpecHierarchyRootWithType( AbstractDocument document, String typeId ) {
        RifSpecHierarchyRoots os = (RifSpecHierarchyRoots)createReference( document.getRif(), RifPackage.eINSTANCE.getRif_SpecHierarchyRoots() );
        SpecHierarchyRoot o = RifFactory.eINSTANCE.createSpecHierarchyRoot();
        initTypedObject( document, o, typeId );
        os.getSpecHierarchyRoot().add( o );
        
        return o;
    }

    private static class FilterByType<T extends SpecElementWithUserDefinedAttributes> {
        
        public List<T> filter( AbstractDocument document, String typeId, List<T> objects ) {
            List<T> filteredObjects = new ArrayList<T>();
            SpecType type = (SpecType)document.getById( typeId, SpecType.class );        
            if( type == null ) return filteredObjects;
            for( T object : objects ) {
                if( typeId.equals( object.getType().getSpecTypeRef() ) ) filteredObjects.add( object );
            }
            
            return filteredObjects;            
        }
    }

}
