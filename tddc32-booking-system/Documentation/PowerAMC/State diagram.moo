<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{55753D8A-61E4-427F-83C5-411267F49842}" Label="" LastModificationDate="1330677762" Name="State diagram" Objects="37" Symbols="66" Target="Analyse" TargetLink="Reference" Type="{18112060-1A4B-11D1-83D9-444553540000}" signature="CLD_OBJECT_MODEL" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>55753D8A-61E4-427F-83C5-411267F49842</a:ObjectID>
<a:Name>State diagram</a:Name>
<a:Code>State_diagram</a:Code>
<a:CreationDate>1330676628</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677388</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Class Diagram Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Cld]
CaseSensitive=No
DisplayName=Yes
EnableTrans=No
EnableRequirements=No
ShowClss=No
DeftAttr=int
DeftMthd=
DeftParm=int
DeftCont=
DomnDttp=Yes
DomnChck=No
DomnRule=No
SupportDelay=No
PreviewEditable=Yes
AutoRealize=No
DttpFullName=Yes
DeftClssAttrVisi=private
VBNetPreprocessingSymbols=
CSharpPreprocessingSymbols=

[ModelOptions\Cld\NamingOptionsTemplates]

[ModelOptions\Cld\ClssNamingOptions]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN]

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS]

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF]

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR]

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS]

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT]

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG]

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP]

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR]

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD]

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM]

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT]

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART]

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC]

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC]

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK]

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK]

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK]

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK]

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV]

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST]

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT]

[ModelOptions\Cld\ClssNamingOptions\STAT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE]

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI]

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC]

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR]

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO]

[ModelOptions\Cld\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK]

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass]

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; +-*/!=&lt;&gt;&#39;&quot;&quot;().&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Cdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
Notation=2

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Xsm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No</a:ModelOptionsText>
<c:ObjectLanguage>
<o:Shortcut Id="o3">
<a:ObjectID>CC7B4056-D5C9-428C-A60B-CFBEB208CB96</a:ObjectID>
<a:Name>Analyse</a:Name>
<a:Code>Analysis</a:Code>
<a:CreationDate>1330676628</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676628</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>87317290-AF03-469F-BC1E-99593F18A4AB</a:TargetID>
<a:TargetClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetClassID>
</o:Shortcut>
</c:ObjectLanguage>
<c:DefaultDiagram>
<o:StatechartDiagram Ref="o4"/>
</c:DefaultDiagram>
<c:StatechartDiagrams>
<o:StatechartDiagram Id="o4">
<a:ObjectID>14669258-CDD9-4A23-9437-C752CBAE0D90</a:ObjectID>
<a:Name>state diagram</a:Name>
<a:Code>state_diagram</a:Code>
<a:CreationDate>1330676628</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677572</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\STD]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=Yes
Grid size=0
Graphic unit=2
Window color=255, 255, 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255, 255, 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=2
Trunc Length=40
Word Length=40
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom de l&amp;#39;objet&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;HorizontalRadios&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;StandardAttribute Name=&quot;Emplacement&quot; Attribute=&quot;LocationOrName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/ExclusiveChoice&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
PckgShowStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
State.Stereotype=Yes
State.Actions=Yes
State.Actions._Columns=LabelWithArguments
State.Actions._Limit=-3
State.Comment=No
State.IconPicture=No
State.SubSymbols=Yes
State_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;SmallDisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardCollection Name=&quot;Actions&quot; Collection=&quot;Actions&quot; Columns=&quot;Label No &amp;quot;Evénement et nom&amp;quot;\r\nLabelWithArguments No &amp;quot;Evénement, nom et arguments&amp;quot;&quot; HasLimit=&quot;Yes&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Commentaire&quot; Attribute=&quot;Comment&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;LEFT&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
JunctionPoint.Stereotype=Yes
JunctionPoint.DisplayName=No
JunctionPoint.IconPicture=No
JunctionPoint_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
Start.Stereotype=Yes
Start.DisplayName=No
Start.IconPicture=No
Start_SymbolLayout=&lt;Form&gt;[CRLF] &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Nom&quot; Attribute=&quot;DisplayName&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;Separator Name=&quot;Séparateur&quot; /&gt;[CRLF] &lt;StandardAttribute Name=&quot;Icône&quot; Attribute=&quot;IconPicture&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Alignment=&quot;CNTR&quot; Caption=&quot;&quot; Mandatory=&quot;Yes&quot; /&gt;[CRLF]&lt;/Form&gt;
End.Stereotype=Yes
End.DisplayName=No
End.IconPicture=No
End_SymbolLayout=
Synchronization.IconPicture=No
Synchronization_SymbolLayout=
Transition.Label=Yes
Transition.LabelWithArguments=No
Transition.Stereotype=Yes
Transition_SymbolLayout=&lt;Form&gt;[CRLF] &lt;Form Name=&quot;Source&quot; &gt;[CRLF]  &lt;ExclusiveChoice Name=&quot;Choix exclusif&quot; Mandatory=&quot;Yes&quot; Display=&quot;VerticalRadios&quot; &gt;[CRLF]   &lt;StandardAttribute Name=&quot;Evénement et nom&quot; Attribute=&quot;Label&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]   &lt;StandardAttribute Name=&quot;Evénement, nom et arguments&quot; Attribute=&quot;LabelWithArguments&quot; Prefix=&quot;&quot; Suffix=&quot;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF]  &lt;/ExclusiveChoice&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Destination&quot; &gt;[CRLF]  &lt;StandardAttribute Name=&quot;Stéréotype&quot; Attribute=&quot;Stereotype&quot; Prefix=&quot;&amp;lt;&amp;lt;&quot; Suffix=&quot;&amp;gt;&amp;gt;&quot; Caption=&quot;&quot; Mandatory=&quot;No&quot; /&gt;[CRLF] &lt;/Form&gt;[CRLF] &lt;Form Name=&quot;Centre&quot; &gt;[CRLF] &lt;/Form&gt;[CRLF]&lt;/Form&gt;

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDPCKG]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\STAT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAME2Font=Arial,8,N
DISPNAME2Font color=0, 0, 0
ActionsFont=Arial,8,N
ActionsFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2500
Brush color=192 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\JNPT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1400
Height=1400
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=224 224 224
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMSTRT]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1200
Height=1200
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMEND]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=Yes
Width=1500
Height=1500
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMSYNC]
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=2400
Height=1500
Brush color=0 128 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=512
Brush gradient color=0 128 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 192
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\ACDTRNS]
SOURCEFont=Arial,8,N
SOURCEFont color=0, 0, 0
DESTINATIONFont=Arial,8,N
DESTINATIONFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0, 0, 0
Line style=1
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0, 0, 0
Line style=0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8268, 11693)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>15</a:PaperSource>
<c:Symbols>
<o:TitleSymbol Id="o5">
<a:Text>Version: </a:Text>
<a:CreationDate>1330677420</a:CreationDate>
<a:ModificationDate>1330677440</a:ModificationDate>
<a:Rect>((-19687,21304), (-7538,28047))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>16711680</a:LineColor>
<a:FillColor>16777215</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TitleSymbol>
<o:TextSymbol Id="o6">
<a:Text>Check availability
</a:Text>
<a:CreationDate>1330677480</a:CreationDate>
<a:ModificationDate>1330677502</a:ModificationDate>
<a:Rect>((9565,10350), (18113,12751))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
<a:ManuallyResized>1</a:ManuallyResized>
</o:TextSymbol>
<o:TextSymbol Id="o7">
<a:Text>Account created</a:Text>
<a:CreationDate>1330677506</a:CreationDate>
<a:ModificationDate>1330677520</a:ModificationDate>
<a:Rect>((-2361,12376), (2438,15975))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o8">
<a:Text>Account not available
</a:Text>
<a:CreationDate>1330677522</a:CreationDate>
<a:ModificationDate>1330677534</a:ModificationDate>
<a:Rect>((3789,9676), (8588,13275))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o9">
<a:Text>Create an account</a:Text>
<a:CreationDate>1330677538</a:CreationDate>
<a:ModificationDate>1330677586</a:ModificationDate>
<a:Rect>((-860,4876), (5814,8475))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
<a:ManuallyResized>1</a:ManuallyResized>
</o:TextSymbol>
<o:TextSymbol Id="o10">
<a:Text>Disconnect
</a:Text>
<a:CreationDate>1330677544</a:CreationDate>
<a:ModificationDate>1330677595</a:ModificationDate>
<a:Rect>((-16386,5326), (-11587,8925))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o11">
<a:Text>Log Out action</a:Text>
<a:CreationDate>1330677545</a:CreationDate>
<a:ModificationDate>1330677608</a:ModificationDate>
<a:Rect>((-21261,-2324), (-16462,1275))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o12">
<a:Text>Cancel a booking
</a:Text>
<a:CreationDate>1330677547</a:CreationDate>
<a:ModificationDate>1330677621</a:ModificationDate>
<a:Rect>((-17511,-7124), (-12712,-3525))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o13">
<a:Text>Confirmation of cancel
</a:Text>
<a:CreationDate>1330677549</a:CreationDate>
<a:ModificationDate>1330677662</a:ModificationDate>
<a:Rect>((-12936,-8699), (-8137,-5100))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o14">
<a:Text>New slot not available
</a:Text>
<a:CreationDate>1330677550</a:CreationDate>
<a:ModificationDate>1330677673</a:ModificationDate>
<a:Rect>((-8811,-18524), (-4012,-14925))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o15">
<a:Text>New Slot available
</a:Text>
<a:CreationDate>1330677551</a:CreationDate>
<a:ModificationDate>1330677684</a:ModificationDate>
<a:Rect>((-786,-15449), (4013,-11850))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o16">
<a:Text>Confirmation of booking</a:Text>
<a:CreationDate>1330677555</a:CreationDate>
<a:ModificationDate>1330677695</a:ModificationDate>
<a:Rect>((-1686,-9974), (3113,-6375))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o17">
<a:Text>Book a machine action</a:Text>
<a:CreationDate>1330677556</a:CreationDate>
<a:ModificationDate>1330677726</a:ModificationDate>
<a:Rect>((-1386,-4049), (3413,-450))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o18">
<a:Text>Check slot availability
</a:Text>
<a:CreationDate>1330677558</a:CreationDate>
<a:ModificationDate>1330677712</a:ModificationDate>
<a:Rect>((3114,-7799), (7913,-4200))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o19">
<a:Text>Logged succesfully</a:Text>
<a:CreationDate>1330677564</a:CreationDate>
<a:ModificationDate>1330677747</a:ModificationDate>
<a:Rect>((-9186,376), (-4387,3975))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TextSymbol Id="o20">
<a:Text>Close the window action
</a:Text>
<a:CreationDate>1330677568</a:CreationDate>
<a:ModificationDate>1330677762</a:ModificationDate>
<a:Rect>((-1611,451), (7163,4050))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:AutoAdjustToText>0</a:AutoAdjustToText>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
<a:ManuallyResized>1</a:ManuallyResized>
</o:TextSymbol>
<o:TextSymbol Id="o21">
<a:Text>Delay a booking
</a:Text>
<a:CreationDate>1330677572</a:CreationDate>
<a:ModificationDate>1330677654</a:ModificationDate>
<a:Rect>((-8811,-11774), (-4012,-8175))</a:Rect>
<a:TextStyle>4130</a:TextStyle>
<a:LineColor>0</a:LineColor>
<a:DashStyle>7</a:DashStyle>
<a:FillColor>0</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontName>Arial,8,N</a:FontName>
</o:TextSymbol>
<o:TransitionSymbol Id="o22">
<a:CreationDate>1330676825</a:CreationDate>
<a:ModificationDate>1330677123</a:ModificationDate>
<a:Rect>((-16162,7013), (-4687,15637))</a:Rect>
<a:ListOfPoints>((-16162,15637),(-4687,15637),(-4687,7013))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StartSymbol Ref="o23"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o24"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o25"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o26">
<a:CreationDate>1330676872</a:CreationDate>
<a:ModificationDate>1330677311</a:ModificationDate>
<a:Rect>((-5192,-11956), (-4742,-4462))</a:Rect>
<a:ListOfPoints>((-4967,-4462),(-4967,-11956))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o27"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o28"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o29"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o30">
<a:CreationDate>1330676874</a:CreationDate>
<a:ModificationDate>1330677143</a:ModificationDate>
<a:Rect>((-5174,-3937), (-4724,7313))</a:Rect>
<a:ListOfPoints>((-4949,7313),(-4949,-3937))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o24"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o27"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o31"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o32">
<a:CreationDate>1330676876</a:CreationDate>
<a:ModificationDate>1330676891</a:ModificationDate>
<a:Rect>((-1612,7047), (8966,7498))</a:Rect>
<a:ListOfPoints>((-1612,7275),(8966,7269))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o24"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o33"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o34"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o35">
<a:CreationDate>1330676878</a:CreationDate>
<a:ModificationDate>1330677115</a:ModificationDate>
<a:Rect>((9806,8072), (10256,16388))</a:Rect>
<a:ListOfPoints>((10031,8072),(10031,16388))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o33"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o36"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o37"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o38">
<a:CreationDate>1330676882</a:CreationDate>
<a:ModificationDate>1330677229</a:ModificationDate>
<a:Rect>((-2662,-4270), (4644,-3820))</a:Rect>
<a:ListOfPoints>((-2662,-4045),(4644,-4045))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o27"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o39"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o40"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o41">
<a:CreationDate>1330676884</a:CreationDate>
<a:ModificationDate>1330677308</a:ModificationDate>
<a:Rect>((-16834,-9285), (-8099,-4087))</a:Rect>
<a:ListOfPoints>((-8099,-4087),(-16834,-4087),(-16834,-9285))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o27"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o42"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o43"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o44">
<a:CreationDate>1330676885</a:CreationDate>
<a:ModificationDate>1330677143</a:ModificationDate>
<a:Rect>((-16912,-3187), (-7687,3751))</a:Rect>
<a:ListOfPoints>((-7687,-3187),(-16912,-3187),(-16912,3751))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o27"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o45"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o46"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o47">
<a:CreationDate>1330676927</a:CreationDate>
<a:ModificationDate>1330677115</a:ModificationDate>
<a:Rect>((-2287,7688), (4463,15563))</a:Rect>
<a:ListOfPoints>((4463,15563),(-2287,15563),(-2287,7688))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o36"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o24"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o48"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o49">
<a:CreationDate>1330677004</a:CreationDate>
<a:ModificationDate>1330677043</a:ModificationDate>
<a:Rect>((-16987,3638), (-2437,6638))</a:Rect>
<a:ListOfPoints>((-16987,3638),(-16987,6638),(-2437,6638))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o45"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o24"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o50"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o51">
<a:CreationDate>1330677112</a:CreationDate>
<a:ModificationDate>1330677115</a:ModificationDate>
<a:Rect>((8137,7763), (8587,14663))</a:Rect>
<a:ListOfPoints>((8362,14663),(8362,7763))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o36"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o33"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o52"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o53">
<a:CreationDate>1330677249</a:CreationDate>
<a:ModificationDate>1330677288</a:ModificationDate>
<a:Rect>((-3262,-12299), (5438,-10649))</a:Rect>
<a:ListOfPoints>((-3262,-12299),(5438,-12299),(5438,-10649))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o28"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o54"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o55"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o56">
<a:CreationDate>1330677251</a:CreationDate>
<a:ModificationDate>1330677285</a:ModificationDate>
<a:Rect>((7650,-9187), (8100,-4537))</a:Rect>
<a:ListOfPoints>((7875,-4537),(7875,-9187))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o39"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o54"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o57"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o58">
<a:CreationDate>1330677261</a:CreationDate>
<a:ModificationDate>1330677302</a:ModificationDate>
<a:Rect>((-7912,-15637), (-5287,-12862))</a:Rect>
<a:ListOfPoints>((-7912,-12862),(-7912,-15637),(-5287,-15637),(-5287,-13087))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o28"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o28"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o59"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o60">
<a:CreationDate>1330677273</a:CreationDate>
<a:ModificationDate>1330677291</a:ModificationDate>
<a:Rect>((-2887,-9562), (4088,-4387))</a:Rect>
<a:ListOfPoints>((4088,-9562),(-2887,-9562),(-2887,-4387))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o54"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o27"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o61"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o62">
<a:CreationDate>1330677317</a:CreationDate>
<a:ModificationDate>1330677660</a:ModificationDate>
<a:Rect>((-14437,-7987), (-6712,-4687))</a:Rect>
<a:ListOfPoints>((-14437,-7987),(-6712,-7987),(-6712,-4687))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o42"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o27"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o63"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o64">
<a:CreationDate>1330677327</a:CreationDate>
<a:ModificationDate>1330677398</a:ModificationDate>
<a:Rect>((-3112,2813), (10463,6638))</a:Rect>
<a:ListOfPoints>((-3112,6638),(-3112,2813),(10463,2813))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o24"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o65"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o66"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o67">
<a:CreationDate>1330677346</a:CreationDate>
<a:ModificationDate>1330677346</a:ModificationDate>
<a:Rect>((-3187,-3487), (10463,1538))</a:Rect>
<a:ListOfPoints>((-3187,-3487),(-3187,1538),(10463,1538))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o27"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:StateSymbol Ref="o65"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o68"/>
</c:Object>
</o:TransitionSymbol>
<o:TransitionSymbol Id="o69">
<a:CreationDate>1330677388</a:CreationDate>
<a:ModificationDate>1330677388</a:ModificationDate>
<a:Rect>((11887,-18937), (12337,1388))</a:Rect>
<a:ListOfPoints>((12112,1388),(12112,-18937))</a:ListOfPoints>
<a:CornerStyle>1</a:CornerStyle>
<a:ArrowStyle>1</a:ArrowStyle>
<a:LineColor>16744448</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>SOURCE 0 Arial,8,N
DESTINATION 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:StateSymbol Ref="o65"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:EndSymbol Ref="o70"/>
</c:DestinationSymbol>
<c:Object>
<o:Transition Ref="o71"/>
</c:Object>
</o:TransitionSymbol>
<o:StateSymbol Id="o24">
<a:CreationDate>1330676816</a:CreationDate>
<a:ModificationDate>1330676845</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-7237,6138), (-1238,8637))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o72"/>
</c:Object>
</o:StateSymbol>
<o:StartSymbol Id="o23">
<a:CreationDate>1330676822</a:CreationDate>
<a:ModificationDate>1330677123</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-16762,15038), (-15563,16237))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>12615680</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>12632256</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:Start Ref="o73"/>
</c:Object>
</o:StartSymbol>
<o:StateSymbol Id="o33">
<a:CreationDate>1330676857</a:CreationDate>
<a:ModificationDate>1330676891</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((7557,6339), (13818,8886))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o74"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o27">
<a:CreationDate>1330676859</a:CreationDate>
<a:ModificationDate>1330677143</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-8062,-5112), (-2063,-2613))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o75"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o39">
<a:CreationDate>1330676864</a:CreationDate>
<a:ModificationDate>1330677229</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((3618,-4761), (10254,-2214))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o76"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o42">
<a:CreationDate>1330676865</a:CreationDate>
<a:ModificationDate>1330677308</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-21132,-9336), (-14046,-6789))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o77"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o28">
<a:CreationDate>1330676867</a:CreationDate>
<a:ModificationDate>1330677223</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-9657,-13461), (-3021,-10914))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o78"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o45">
<a:CreationDate>1330676868</a:CreationDate>
<a:ModificationDate>1330677037</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-19762,2088), (-13763,4587))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o79"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o36">
<a:CreationDate>1330676904</a:CreationDate>
<a:ModificationDate>1330677115</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((4521,14364), (14757,16911))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o80"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o54">
<a:CreationDate>1330677235</a:CreationDate>
<a:ModificationDate>1330677285</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((3338,-11187), (9337,-8688))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o81"/>
</c:Object>
</o:StateSymbol>
<o:StateSymbol Id="o65">
<a:CreationDate>1330677321</a:CreationDate>
<a:ModificationDate>1330677321</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((10163,888), (16162,3387))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>16777152</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME2 0 Arial,8,N
Actions 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:State Ref="o82"/>
</c:Object>
</o:StateSymbol>
<o:EndSymbol Id="o70">
<a:CreationDate>1330677367</a:CreationDate>
<a:ModificationDate>1330677367</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((11363,-19687), (12862,-18188))</a:Rect>
<a:LineColor>12615680</a:LineColor>
<a:FillColor>12615680</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>12632256</a:GradientEndColor>
<a:KeepAspect>1</a:KeepAspect>
<a:KeepCenter>1</a:KeepCenter>
<a:KeepSize>1</a:KeepSize>
<c:Object>
<o:End Ref="o83"/>
</c:Object>
</o:EndSymbol>
</c:Symbols>
</o:StatechartDiagram>
</c:StatechartDiagrams>
<c:Transitions>
<o:Transition Id="o25">
<a:ObjectID>BB7754C6-0EE7-4F1C-8F69-B77227B764C9</a:ObjectID>
<a:CreationDate>1330676825</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676825</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o72"/>
</c:Object1>
<c:Object2>
<o:Start Ref="o73"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o29">
<a:ObjectID>0DC9B510-4C42-4A2A-B68B-0718FFA098E5</a:ObjectID>
<a:CreationDate>1330676872</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676872</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o78"/>
</c:Object1>
<c:Object2>
<o:State Ref="o75"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o31">
<a:ObjectID>3611DE7F-85D9-4AE8-ABE1-B4AD1D7D1037</a:ObjectID>
<a:CreationDate>1330676874</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676874</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o75"/>
</c:Object1>
<c:Object2>
<o:State Ref="o72"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o34">
<a:ObjectID>11A79426-163C-4652-976C-BC32C4C17146</a:ObjectID>
<a:CreationDate>1330676876</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676876</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o74"/>
</c:Object1>
<c:Object2>
<o:State Ref="o72"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o37">
<a:ObjectID>0E7F5291-BF2B-4EFF-A593-D40EF5BADAF7</a:ObjectID>
<a:CreationDate>1330676878</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676923</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o80"/>
</c:Object1>
<c:Object2>
<o:State Ref="o74"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o40">
<a:ObjectID>A9E62D41-4712-4D48-994A-BB0835ED38C0</a:ObjectID>
<a:CreationDate>1330676882</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676882</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o76"/>
</c:Object1>
<c:Object2>
<o:State Ref="o75"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o43">
<a:ObjectID>9A0FA3A1-7537-4DBD-B235-D5C9DE4B6712</a:ObjectID>
<a:CreationDate>1330676884</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676884</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o77"/>
</c:Object1>
<c:Object2>
<o:State Ref="o75"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o46">
<a:ObjectID>E328CBE6-ACBC-4D33-9103-316FDEC0EBD5</a:ObjectID>
<a:CreationDate>1330676885</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676885</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o79"/>
</c:Object1>
<c:Object2>
<o:State Ref="o75"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o48">
<a:ObjectID>FF8991FC-1218-4539-ABA6-5C35788B1C7B</a:ObjectID>
<a:CreationDate>1330676927</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676927</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o72"/>
</c:Object1>
<c:Object2>
<o:State Ref="o80"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o50">
<a:ObjectID>73CAD4CD-43E9-4998-B0A9-4F8E26A4CE55</a:ObjectID>
<a:CreationDate>1330677004</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677004</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o72"/>
</c:Object1>
<c:Object2>
<o:State Ref="o79"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o52">
<a:ObjectID>52D9F800-204A-46D2-89F2-CD9ECA6DCFBF</a:ObjectID>
<a:CreationDate>1330677112</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677112</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o74"/>
</c:Object1>
<c:Object2>
<o:State Ref="o80"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o55">
<a:ObjectID>0C487E72-8A34-47DF-A174-69F3CB17C72D</a:ObjectID>
<a:CreationDate>1330677249</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677249</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o81"/>
</c:Object1>
<c:Object2>
<o:State Ref="o78"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o57">
<a:ObjectID>3477608C-08D9-42E7-94A7-A98FF27D2BF0</a:ObjectID>
<a:CreationDate>1330677251</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677251</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o81"/>
</c:Object1>
<c:Object2>
<o:State Ref="o76"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o59">
<a:ObjectID>815EF34A-09ED-41A9-8587-B24EAFA40C96</a:ObjectID>
<a:CreationDate>1330677261</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677261</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o78"/>
</c:Object1>
<c:Object2>
<o:State Ref="o78"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o61">
<a:ObjectID>68B8CF29-59FE-4A64-A19B-0E693252C97C</a:ObjectID>
<a:CreationDate>1330677273</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677273</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o75"/>
</c:Object1>
<c:Object2>
<o:State Ref="o81"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o63">
<a:ObjectID>7CA8D5D2-2863-4F5B-8CD1-F7BB31451078</a:ObjectID>
<a:CreationDate>1330677317</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677317</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o75"/>
</c:Object1>
<c:Object2>
<o:State Ref="o77"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o66">
<a:ObjectID>3D09A0FD-BC2F-4810-8A18-F4C2DFC1C8E9</a:ObjectID>
<a:CreationDate>1330677327</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677327</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o82"/>
</c:Object1>
<c:Object2>
<o:State Ref="o72"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o68">
<a:ObjectID>740FCF0A-1782-4A25-8523-E007A4E70A8D</a:ObjectID>
<a:CreationDate>1330677346</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677346</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:State Ref="o82"/>
</c:Object1>
<c:Object2>
<o:State Ref="o75"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o84">
<a:ObjectID>A565F2C4-8793-4F95-9628-8AD1A626311D</a:ObjectID>
<a:CreationDate>1330677369</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677369</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:End Ref="o83"/>
</c:Object1>
<c:Object2>
<o:State Ref="o82"/>
</c:Object2>
</o:Transition>
<o:Transition Id="o71">
<a:ObjectID>35091230-8B09-4174-A23D-720796415CCC</a:ObjectID>
<a:CreationDate>1330677388</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677388</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<c:Object1>
<o:End Ref="o83"/>
</c:Object1>
<c:Object2>
<o:State Ref="o82"/>
</c:Object2>
</o:Transition>
</c:Transitions>
<c:Starts>
<o:Start Id="o73">
<a:ObjectID>F7775750-4D49-4C1F-AC99-97FC67D4F5A0</a:ObjectID>
<a:Name>Debut_1</a:Name>
<a:Code>Debut_1</a:Code>
<a:CreationDate>1330676822</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676822</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:Start>
</c:Starts>
<c:Ends>
<o:End Id="o83">
<a:ObjectID>B69A21AD-0933-4C6E-8314-F689273F0104</a:ObjectID>
<a:Name>Fin_1</a:Name>
<a:Code>Fin_1</a:Code>
<a:CreationDate>1330677367</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677367</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:End>
</c:Ends>
<c:States>
<o:State Id="o72">
<a:ObjectID>C83BF8AB-B93F-4998-9203-FC814A7AADE3</a:ObjectID>
<a:Name>Login Screen</a:Name>
<a:Code>Login_Screen</a:Code>
<a:CreationDate>1330676816</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676841</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o74">
<a:ObjectID>5128EE6E-29BA-4CB9-97C9-F57ABFAAD730</a:ObjectID>
<a:Name>Create account</a:Name>
<a:Code>Create_account</a:Code>
<a:CreationDate>1330676857</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676901</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o75">
<a:ObjectID>5CB2D0A9-1421-44D8-A308-172A95B0B3CB</a:ObjectID>
<a:Name>Calendar view</a:Name>
<a:Code>Calendar_view</a:Code>
<a:CreationDate>1330676859</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676945</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o76">
<a:ObjectID>64E51746-8FE2-4065-BA62-341E9C0B77BB</a:ObjectID>
<a:Name>Book a machine</a:Name>
<a:Code>Book_a_machine</a:Code>
<a:CreationDate>1330676864</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676955</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o77">
<a:ObjectID>E272DCDB-AC27-45A1-90EC-92E893E1130F</a:ObjectID>
<a:Name>Cancel a booking</a:Name>
<a:Code>Cancel_a_booking</a:Code>
<a:CreationDate>1330676865</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677209</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o78">
<a:ObjectID>55601DA3-DFE7-4D1A-81A3-82F1DAF9E13E</a:ObjectID>
<a:Name>Delay a booking</a:Name>
<a:Code>Delay_a_booking</a:Code>
<a:CreationDate>1330676867</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677220</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o79">
<a:ObjectID>2C49E170-89C3-4E6B-ABDB-B1AAA9B8171F</a:ObjectID>
<a:Name>Log Out</a:Name>
<a:Code>Log_Out</a:Code>
<a:CreationDate>1330676868</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676999</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o80">
<a:ObjectID>07C436F5-F2BE-4F51-9167-6CBC11578F48</a:ObjectID>
<a:Name>Verifiy account availability</a:Name>
<a:Code>Verifiy_account_availability</a:Code>
<a:CreationDate>1330676904</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676919</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o81">
<a:ObjectID>B3686BE5-C696-42AB-9901-D83DE7A55866</a:ObjectID>
<a:Name>Slot available</a:Name>
<a:Code>Slot_available</a:Code>
<a:CreationDate>1330677235</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677244</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
<o:State Id="o82">
<a:ObjectID>503C1FD9-289D-4A10-B803-189F333095D0</a:ObjectID>
<a:Name>Close Window</a:Name>
<a:Code>Close_Window</a:Code>
<a:CreationDate>1330677321</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330677355</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
</o:State>
</c:States>
<c:TargetModels>
<o:TargetModel Id="o85">
<a:ObjectID>4C752595-6E84-440C-96E3-44B1726BB879</a:ObjectID>
<a:Name>Analyse</a:Name>
<a:Code>Analysis</a:Code>
<a:CreationDate>1330676628</a:CreationDate>
<a:Creator>Remi</a:Creator>
<a:ModificationDate>1330676628</a:ModificationDate>
<a:Modifier>Remi</a:Modifier>
<a:TargetModelURL>file:///%_OBJLANG%/analysis.xol</a:TargetModelURL>
<a:TargetModelID>87317290-AF03-469F-BC1E-99593F18A4AB</a:TargetModelID>
<a:TargetModelClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>