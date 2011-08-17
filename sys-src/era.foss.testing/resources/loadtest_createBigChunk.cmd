@echo off

FOR /L %%I IN (100000,1,200000) DO (
echo INFO: %%I 1>&2
echo     ^<specObjects iD="%%I_soID" type="//@coreContent/@specTypes.0"^>
echo      ^<values xsi:type="era.foss.rif:AttributeValueSimple" iD="%%I_vID_a" theValue="5" definition="//@coreContent/@specTypes.0/@specAttributes.0"/^>
echo      ^<values xsi:type="era.foss.rif:AttributeValueSimple" iD="%%I_vID_b" theValue="Hierarchy" definition="//@coreContent/@specTypes.0/@specAttributes.1"/^>
echo    ^</specObjects^>
)
