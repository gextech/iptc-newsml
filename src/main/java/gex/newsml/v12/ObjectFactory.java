
package gex.newsml.v12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gex.newsml.v12 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME = new QName("http://iptc.org/std/NewsML/2003-10-10/", "Origin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gex.newsml.v12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewsML }
     * 
     */
    public NewsML createNewsML() {
        return new NewsML();
    }

    /**
     * Create an instance of {@link NewsComponentType }
     * 
     */
    public NewsComponentType createNewsComponentType() {
        return new NewsComponentType();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem }
     * 
     */
    public NewsComponentType.ContentItem createNewsComponentTypeContentItem() {
        return new NewsComponentType.ContentItem();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.Characteristics }
     * 
     */
    public NewsComponentType.ContentItem.Characteristics createNewsComponentTypeContentItemCharacteristics() {
        return new NewsComponentType.ContentItem.Characteristics();
    }

    /**
     * Create an instance of {@link NewsComponentType.Metadata }
     * 
     */
    public NewsComponentType.Metadata createNewsComponentTypeMetadata() {
        return new NewsComponentType.Metadata();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata }
     * 
     */
    public NewsComponentType.DescriptiveMetadata createNewsComponentTypeDescriptiveMetadata() {
        return new NewsComponentType.DescriptiveMetadata();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.OfInterestTo }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.OfInterestTo createNewsComponentTypeDescriptiveMetadataOfInterestTo() {
        return new NewsComponentType.DescriptiveMetadata.OfInterestTo();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.SubjectCode }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.SubjectCode createNewsComponentTypeDescriptiveMetadataSubjectCode() {
        return new NewsComponentType.DescriptiveMetadata.SubjectCode();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata }
     * 
     */
    public NewsComponentType.RightsMetadata createNewsComponentTypeRightsMetadata() {
        return new NewsComponentType.RightsMetadata();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights createNewsComponentTypeRightsMetadataUsageRights() {
        return new NewsComponentType.RightsMetadata.UsageRights();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.Copyright }
     * 
     */
    public NewsComponentType.RightsMetadata.Copyright createNewsComponentTypeRightsMetadataCopyright() {
        return new NewsComponentType.RightsMetadata.Copyright();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata }
     * 
     */
    public NewsComponentType.AdministrativeMetadata createNewsComponentTypeAdministrativeMetadata() {
        return new NewsComponentType.AdministrativeMetadata();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.Contributor }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.Contributor createNewsComponentTypeAdministrativeMetadataContributor() {
        return new NewsComponentType.AdministrativeMetadata.Contributor();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines }
     * 
     */
    public NewsComponentType.NewsLines createNewsComponentTypeNewsLines() {
        return new NewsComponentType.NewsLines();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.NewsLine }
     * 
     */
    public NewsComponentType.NewsLines.NewsLine createNewsComponentTypeNewsLinesNewsLine() {
        return new NewsComponentType.NewsLines.NewsLine();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType }
     * 
     */
    public gex.newsml.v12.NewsItemType createNewsItemType() {
        return new gex.newsml.v12.NewsItemType();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Update }
     * 
     */
    public gex.newsml.v12.NewsItemType.Update createNewsItemTypeUpdate() {
        return new gex.newsml.v12.NewsItemType.Update();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement createNewsItemTypeNewsManagement() {
        return new gex.newsml.v12.NewsItemType.NewsManagement();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.Instruction }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.Instruction createNewsItemTypeNewsManagementInstruction() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.Instruction();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange createNewsItemTypeNewsManagementStatusWillChange() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification createNewsItemTypeIdentification() {
        return new gex.newsml.v12.NewsItemType.Identification();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.Label }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.Label createNewsItemTypeIdentificationLabel() {
        return new gex.newsml.v12.NewsItemType.Identification.Label();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.NewsIdentifier }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.NewsIdentifier createNewsItemTypeIdentificationNewsIdentifier() {
        return new gex.newsml.v12.NewsItemType.Identification.NewsIdentifier();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope }
     * 
     */
    public NewsML.NewsEnvelope createNewsMLNewsEnvelope() {
        return new NewsML.NewsEnvelope();
    }

    /**
     * Create an instance of {@link TopicSetType }
     * 
     */
    public TopicSetType createTopicSetType() {
        return new TopicSetType();
    }

    /**
     * Create an instance of {@link TopicSetType.Topic }
     * 
     */
    public TopicSetType.Topic createTopicSetTypeTopic() {
        return new TopicSetType.Topic();
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     */
    public CatalogType createCatalogType() {
        return new CatalogType();
    }

    /**
     * Create an instance of {@link CatalogType.Resource }
     * 
     */
    public CatalogType.Resource createCatalogTypeResource() {
        return new CatalogType.Resource();
    }

    /**
     * Create an instance of {@link OriginType }
     * 
     */
    public OriginType createOriginType() {
        return new OriginType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link ContributionType }
     * 
     */
    public ContributionType createContributionType() {
        return new ContributionType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link DateAndTimeType }
     * 
     */
    public DateAndTimeType createDateAndTimeType() {
        return new DateAndTimeType();
    }

    /**
     * Create an instance of {@link NewsComponentType.Role }
     * 
     */
    public NewsComponentType.Role createNewsComponentTypeRole() {
        return new NewsComponentType.Role();
    }

    /**
     * Create an instance of {@link NewsComponentType.BasisForChoice }
     * 
     */
    public NewsComponentType.BasisForChoice createNewsComponentTypeBasisForChoice() {
        return new NewsComponentType.BasisForChoice();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsItemRef }
     * 
     */
    public NewsComponentType.NewsItemRef createNewsComponentTypeNewsItemRef() {
        return new NewsComponentType.NewsItemRef();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.MediaType }
     * 
     */
    public NewsComponentType.ContentItem.MediaType createNewsComponentTypeContentItemMediaType() {
        return new NewsComponentType.ContentItem.MediaType();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.Format }
     * 
     */
    public NewsComponentType.ContentItem.Format createNewsComponentTypeContentItemFormat() {
        return new NewsComponentType.ContentItem.Format();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.MimeType }
     * 
     */
    public NewsComponentType.ContentItem.MimeType createNewsComponentTypeContentItemMimeType() {
        return new NewsComponentType.ContentItem.MimeType();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.Notation }
     * 
     */
    public NewsComponentType.ContentItem.Notation createNewsComponentTypeContentItemNotation() {
        return new NewsComponentType.ContentItem.Notation();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.Encoding }
     * 
     */
    public NewsComponentType.ContentItem.Encoding createNewsComponentTypeContentItemEncoding() {
        return new NewsComponentType.ContentItem.Encoding();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.DataContent }
     * 
     */
    public NewsComponentType.ContentItem.DataContent createNewsComponentTypeContentItemDataContent() {
        return new NewsComponentType.ContentItem.DataContent();
    }

    /**
     * Create an instance of {@link NewsComponentType.ContentItem.Characteristics.SizeInBytes }
     * 
     */
    public NewsComponentType.ContentItem.Characteristics.SizeInBytes createNewsComponentTypeContentItemCharacteristicsSizeInBytes() {
        return new NewsComponentType.ContentItem.Characteristics.SizeInBytes();
    }

    /**
     * Create an instance of {@link NewsComponentType.Metadata.MetadataType }
     * 
     */
    public NewsComponentType.Metadata.MetadataType createNewsComponentTypeMetadataMetadataType() {
        return new NewsComponentType.Metadata.MetadataType();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.Language }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.Language createNewsComponentTypeDescriptiveMetadataLanguage() {
        return new NewsComponentType.DescriptiveMetadata.Language();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.Genre }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.Genre createNewsComponentTypeDescriptiveMetadataGenre() {
        return new NewsComponentType.DescriptiveMetadata.Genre();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.DateLineDate }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.DateLineDate createNewsComponentTypeDescriptiveMetadataDateLineDate() {
        return new NewsComponentType.DescriptiveMetadata.DateLineDate();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.Location }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.Location createNewsComponentTypeDescriptiveMetadataLocation() {
        return new NewsComponentType.DescriptiveMetadata.Location();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.TopicOccurrence }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.TopicOccurrence createNewsComponentTypeDescriptiveMetadataTopicOccurrence() {
        return new NewsComponentType.DescriptiveMetadata.TopicOccurrence();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance createNewsComponentTypeDescriptiveMetadataOfInterestToRelevance() {
        return new NewsComponentType.DescriptiveMetadata.OfInterestTo.Relevance();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.SubjectCode.Subject }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.SubjectCode.Subject createNewsComponentTypeDescriptiveMetadataSubjectCodeSubject() {
        return new NewsComponentType.DescriptiveMetadata.SubjectCode.Subject();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectMatter }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectMatter createNewsComponentTypeDescriptiveMetadataSubjectCodeSubjectMatter() {
        return new NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectMatter();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectDetail }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectDetail createNewsComponentTypeDescriptiveMetadataSubjectCodeSubjectDetail() {
        return new NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectDetail();
    }

    /**
     * Create an instance of {@link NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectQualifier }
     * 
     */
    public NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectQualifier createNewsComponentTypeDescriptiveMetadataSubjectCodeSubjectQualifier() {
        return new NewsComponentType.DescriptiveMetadata.SubjectCode.SubjectQualifier();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.UsageType }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.UsageType createNewsComponentTypeRightsMetadataUsageRightsUsageType() {
        return new NewsComponentType.RightsMetadata.UsageRights.UsageType();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.Geography }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.Geography createNewsComponentTypeRightsMetadataUsageRightsGeography() {
        return new NewsComponentType.RightsMetadata.UsageRights.Geography();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.RightsHolder }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.RightsHolder createNewsComponentTypeRightsMetadataUsageRightsRightsHolder() {
        return new NewsComponentType.RightsMetadata.UsageRights.RightsHolder();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.Limitations }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.Limitations createNewsComponentTypeRightsMetadataUsageRightsLimitations() {
        return new NewsComponentType.RightsMetadata.UsageRights.Limitations();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.StartDate }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.StartDate createNewsComponentTypeRightsMetadataUsageRightsStartDate() {
        return new NewsComponentType.RightsMetadata.UsageRights.StartDate();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.UsageRights.EndDate }
     * 
     */
    public NewsComponentType.RightsMetadata.UsageRights.EndDate createNewsComponentTypeRightsMetadataUsageRightsEndDate() {
        return new NewsComponentType.RightsMetadata.UsageRights.EndDate();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.Copyright.CopyrightHolder }
     * 
     */
    public NewsComponentType.RightsMetadata.Copyright.CopyrightHolder createNewsComponentTypeRightsMetadataCopyrightCopyrightHolder() {
        return new NewsComponentType.RightsMetadata.Copyright.CopyrightHolder();
    }

    /**
     * Create an instance of {@link NewsComponentType.RightsMetadata.Copyright.CopyrightDate }
     * 
     */
    public NewsComponentType.RightsMetadata.Copyright.CopyrightDate createNewsComponentTypeRightsMetadataCopyrightCopyrightDate() {
        return new NewsComponentType.RightsMetadata.Copyright.CopyrightDate();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.FileName }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.FileName createNewsComponentTypeAdministrativeMetadataFileName() {
        return new NewsComponentType.AdministrativeMetadata.FileName();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.SystemIdentifier }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.SystemIdentifier createNewsComponentTypeAdministrativeMetadataSystemIdentifier() {
        return new NewsComponentType.AdministrativeMetadata.SystemIdentifier();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.Provider }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.Provider createNewsComponentTypeAdministrativeMetadataProvider() {
        return new NewsComponentType.AdministrativeMetadata.Provider();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.Creator }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.Creator createNewsComponentTypeAdministrativeMetadataCreator() {
        return new NewsComponentType.AdministrativeMetadata.Creator();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.Source }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.Source createNewsComponentTypeAdministrativeMetadataSource() {
        return new NewsComponentType.AdministrativeMetadata.Source();
    }

    /**
     * Create an instance of {@link NewsComponentType.AdministrativeMetadata.Contributor.Party }
     * 
     */
    public NewsComponentType.AdministrativeMetadata.Contributor.Party createNewsComponentTypeAdministrativeMetadataContributorParty() {
        return new NewsComponentType.AdministrativeMetadata.Contributor.Party();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.HeadLine }
     * 
     */
    public NewsComponentType.NewsLines.HeadLine createNewsComponentTypeNewsLinesHeadLine() {
        return new NewsComponentType.NewsLines.HeadLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.SubHeadLine }
     * 
     */
    public NewsComponentType.NewsLines.SubHeadLine createNewsComponentTypeNewsLinesSubHeadLine() {
        return new NewsComponentType.NewsLines.SubHeadLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.ByLine }
     * 
     */
    public NewsComponentType.NewsLines.ByLine createNewsComponentTypeNewsLinesByLine() {
        return new NewsComponentType.NewsLines.ByLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.ByLineTitle }
     * 
     */
    public NewsComponentType.NewsLines.ByLineTitle createNewsComponentTypeNewsLinesByLineTitle() {
        return new NewsComponentType.NewsLines.ByLineTitle();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.DateLine }
     * 
     */
    public NewsComponentType.NewsLines.DateLine createNewsComponentTypeNewsLinesDateLine() {
        return new NewsComponentType.NewsLines.DateLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.CreditLine }
     * 
     */
    public NewsComponentType.NewsLines.CreditLine createNewsComponentTypeNewsLinesCreditLine() {
        return new NewsComponentType.NewsLines.CreditLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.CopyrightLine }
     * 
     */
    public NewsComponentType.NewsLines.CopyrightLine createNewsComponentTypeNewsLinesCopyrightLine() {
        return new NewsComponentType.NewsLines.CopyrightLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.RightsLine }
     * 
     */
    public NewsComponentType.NewsLines.RightsLine createNewsComponentTypeNewsLinesRightsLine() {
        return new NewsComponentType.NewsLines.RightsLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.SeriesLine }
     * 
     */
    public NewsComponentType.NewsLines.SeriesLine createNewsComponentTypeNewsLinesSeriesLine() {
        return new NewsComponentType.NewsLines.SeriesLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.SlugLine }
     * 
     */
    public NewsComponentType.NewsLines.SlugLine createNewsComponentTypeNewsLinesSlugLine() {
        return new NewsComponentType.NewsLines.SlugLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.KeywordLine }
     * 
     */
    public NewsComponentType.NewsLines.KeywordLine createNewsComponentTypeNewsLinesKeywordLine() {
        return new NewsComponentType.NewsLines.KeywordLine();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.NewsLine.NewsLineType }
     * 
     */
    public NewsComponentType.NewsLines.NewsLine.NewsLineType createNewsComponentTypeNewsLinesNewsLineNewsLineType() {
        return new NewsComponentType.NewsLines.NewsLine.NewsLineType();
    }

    /**
     * Create an instance of {@link NewsComponentType.NewsLines.NewsLine.NewsLineText }
     * 
     */
    public NewsComponentType.NewsLines.NewsLine.NewsLineText createNewsComponentTypeNewsLinesNewsLineNewsLineText() {
        return new NewsComponentType.NewsLines.NewsLine.NewsLineText();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Update.InsertBefore }
     * 
     */
    public gex.newsml.v12.NewsItemType.Update.InsertBefore createNewsItemTypeUpdateInsertBefore() {
        return new gex.newsml.v12.NewsItemType.Update.InsertBefore();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Update.InsertAfter }
     * 
     */
    public gex.newsml.v12.NewsItemType.Update.InsertAfter createNewsItemTypeUpdateInsertAfter() {
        return new gex.newsml.v12.NewsItemType.Update.InsertAfter();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Update.Replace }
     * 
     */
    public gex.newsml.v12.NewsItemType.Update.Replace createNewsItemTypeUpdateReplace() {
        return new gex.newsml.v12.NewsItemType.Update.Replace();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Update.Delete }
     * 
     */
    public gex.newsml.v12.NewsItemType.Update.Delete createNewsItemTypeUpdateDelete() {
        return new gex.newsml.v12.NewsItemType.Update.Delete();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.NewsItemType }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.Type createNewsItemTypeNewsManagementNewsItemType() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.Type();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.FirstCreated }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.FirstCreated createNewsItemTypeNewsManagementFirstCreated() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.FirstCreated();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.ThisRevisionCreated }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.ThisRevisionCreated createNewsItemTypeNewsManagementThisRevisionCreated() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.ThisRevisionCreated();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.Urgency }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.Urgency createNewsItemTypeNewsManagementUrgency() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.Urgency();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.RevisionHistory }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.RevisionHistory createNewsItemTypeNewsManagementRevisionHistory() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.RevisionHistory();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.DerivedFrom }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.DerivedFrom createNewsItemTypeNewsManagementDerivedFrom() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.DerivedFrom();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.AssociatedWith }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.AssociatedWith createNewsItemTypeNewsManagementAssociatedWith() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.AssociatedWith();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.Instruction.RevisionStatus }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.Instruction.RevisionStatus createNewsItemTypeNewsManagementInstructionRevisionStatus() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.Instruction.RevisionStatus();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange.FutureStatus }
     * 
     */
    public gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange.FutureStatus createNewsItemTypeNewsManagementStatusWillChangeFutureStatus() {
        return new gex.newsml.v12.NewsItemType.NewsManagement.StatusWillChange.FutureStatus();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.NameLabel }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.NameLabel createNewsItemTypeIdentificationNameLabel() {
        return new gex.newsml.v12.NewsItemType.Identification.NameLabel();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.DateLabel }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.DateLabel createNewsItemTypeIdentificationDateLabel() {
        return new gex.newsml.v12.NewsItemType.Identification.DateLabel();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.Label.LabelType }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.Label.LabelType createNewsItemTypeIdentificationLabelLabelType() {
        return new gex.newsml.v12.NewsItemType.Identification.Label.LabelType();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.Label.LabelText }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.Label.LabelText createNewsItemTypeIdentificationLabelLabelText() {
        return new gex.newsml.v12.NewsItemType.Identification.Label.LabelText();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.ProviderId }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.ProviderId createNewsItemTypeIdentificationNewsIdentifierProviderId() {
        return new gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.ProviderId();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.NewsItemId }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.NewsItemId createNewsItemTypeIdentificationNewsIdentifierNewsItemId() {
        return new gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.NewsItemId();
    }

    /**
     * Create an instance of {@link gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.RevisionId }
     * 
     */
    public gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.RevisionId createNewsItemTypeIdentificationNewsIdentifierRevisionId() {
        return new gex.newsml.v12.NewsItemType.Identification.NewsIdentifier.RevisionId();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.TransmissionId }
     * 
     */
    public NewsML.NewsEnvelope.TransmissionId createNewsMLNewsEnvelopeTransmissionId() {
        return new NewsML.NewsEnvelope.TransmissionId();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.SentFrom }
     * 
     */
    public NewsML.NewsEnvelope.SentFrom createNewsMLNewsEnvelopeSentFrom() {
        return new NewsML.NewsEnvelope.SentFrom();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.SentTo }
     * 
     */
    public NewsML.NewsEnvelope.SentTo createNewsMLNewsEnvelopeSentTo() {
        return new NewsML.NewsEnvelope.SentTo();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.NewsService }
     * 
     */
    public NewsML.NewsEnvelope.NewsService createNewsMLNewsEnvelopeNewsService() {
        return new NewsML.NewsEnvelope.NewsService();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.NewsProduct }
     * 
     */
    public NewsML.NewsEnvelope.NewsProduct createNewsMLNewsEnvelopeNewsProduct() {
        return new NewsML.NewsEnvelope.NewsProduct();
    }

    /**
     * Create an instance of {@link NewsML.NewsEnvelope.Priority }
     * 
     */
    public NewsML.NewsEnvelope.Priority createNewsMLNewsEnvelopePriority() {
        return new NewsML.NewsEnvelope.Priority();
    }

    /**
     * Create an instance of {@link TopicSetType.TopicSetRef }
     * 
     */
    public TopicSetType.TopicSetRef createTopicSetTypeTopicSetRef() {
        return new TopicSetType.TopicSetRef();
    }

    /**
     * Create an instance of {@link TopicSetType.Topic.TopicType }
     * 
     */
    public TopicSetType.Topic.TopicType createTopicSetTypeTopicTopicType() {
        return new TopicSetType.Topic.TopicType();
    }

    /**
     * Create an instance of {@link TopicSetType.Topic.FormalName }
     * 
     */
    public TopicSetType.Topic.FormalName createTopicSetTypeTopicFormalName() {
        return new TopicSetType.Topic.FormalName();
    }

    /**
     * Create an instance of {@link TopicSetType.Topic.Description }
     * 
     */
    public TopicSetType.Topic.Description createTopicSetTypeTopicDescription() {
        return new TopicSetType.Topic.Description();
    }

    /**
     * Create an instance of {@link CatalogType.TopicUse }
     * 
     */
    public CatalogType.TopicUse createCatalogTypeTopicUse() {
        return new CatalogType.TopicUse();
    }

    /**
     * Create an instance of {@link CatalogType.Resource.Urn }
     * 
     */
    public CatalogType.Resource.Urn createCatalogTypeResourceUrn() {
        return new CatalogType.Resource.Urn();
    }

    /**
     * Create an instance of {@link CatalogType.Resource.Url }
     * 
     */
    public CatalogType.Resource.Url createCatalogTypeResourceUrl() {
        return new CatalogType.Resource.Url();
    }

    /**
     * Create an instance of {@link CatalogType.Resource.DefaultVocabularyFor }
     * 
     */
    public CatalogType.Resource.DefaultVocabularyFor createCatalogTypeResourceDefaultVocabularyFor() {
        return new CatalogType.Resource.DefaultVocabularyFor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.UsageType.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.UsageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.RightsLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesRightsLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.RightsLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.HeadLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesHeadLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.HeadLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.KeywordLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesKeywordLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.KeywordLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.Geography.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsGeographyOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.Geography.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.CopyrightLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesCopyrightLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.CopyrightLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.SeriesLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesSeriesLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.SeriesLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.StartDate.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsStartDateOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.StartDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.ByLineTitle.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesByLineTitleOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.ByLineTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = OriginType.class)
    public JAXBElement<OriginType> createOriginTypeOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, OriginType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.CreditLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesCreditLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.CreditLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.ByLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesByLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.ByLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.EndDate.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsEndDateOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.EndDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.Limitations.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsLimitationsOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.Limitations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.SubHeadLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesSubHeadLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.SubHeadLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.DateLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesDateLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.DateLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.NewsLine.NewsLineText.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesNewsLineNewsLineTextOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.NewsLine.NewsLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.Copyright.CopyrightHolder.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataCopyrightCopyrightHolderOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.Copyright.CopyrightHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.NewsLines.SlugLine.class)
    public JAXBElement<OriginType> createNewsComponentTypeNewsLinesSlugLineOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.NewsLines.SlugLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.Copyright.CopyrightDate.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataCopyrightCopyrightDateOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.Copyright.CopyrightDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iptc.org/std/NewsML/2003-10-10/", name = "Origin", scope = NewsComponentType.RightsMetadata.UsageRights.RightsHolder.class)
    public JAXBElement<OriginType> createNewsComponentTypeRightsMetadataUsageRightsRightsHolderOrigin(OriginType value) {
        return new JAXBElement<OriginType>(_NewsComponentTypeRightsMetadataUsageRightsUsageTypeOrigin_QNAME, OriginType.class, NewsComponentType.RightsMetadata.UsageRights.RightsHolder.class, value);
    }

}
