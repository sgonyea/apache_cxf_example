
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands;
import com.exacttarget.wsdl.partnerapi.ConfigureRequestMsg.Configurations;
import com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults;
import com.exacttarget.wsdl.partnerapi.DataExtension.Fields;
import com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys;
import com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers;
import com.exacttarget.wsdl.partnerapi.ImportDefinition.FieldMaps;
import com.exacttarget.wsdl.partnerapi.ObjectDefinition.ExtendedProperties;
import com.exacttarget.wsdl.partnerapi.ObjectExtension.Properties;
import com.exacttarget.wsdl.partnerapi.Options.SaveOptions;
import com.exacttarget.wsdl.partnerapi.PropertyDefinition.PicklistItems;
import com.exacttarget.wsdl.partnerapi.PropertyDefinition.References;
import com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves;
import com.exacttarget.wsdl.partnerapi.ScheduleRequestMsg.Interactions;
import com.exacttarget.wsdl.partnerapi.Send.Sources;
import com.exacttarget.wsdl.partnerapi.Subscriber.Addresses;
import com.exacttarget.wsdl.partnerapi.SubscriberAddress.Statuses;
import com.exacttarget.wsdl.partnerapi.SystemStatusResult.Outages;
import com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags;
import com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exacttarget.wsdl.partnerapi package. 
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

    private final static QName _Subscriber_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private final static QName _PrivateDomain_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomain");
    private final static QName _SenderProfile_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SenderProfile");
    private final static QName _List_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private final static QName _DailyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DailyRecurrence");
    private final static QName _TriggeredSend_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSend");
    private final static QName _UpdateOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "UpdateOptions");
    private final static QName _SendDefinitionList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinitionList");
    private final static QName _Group_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Group");
    private final static QName _DeleteOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DeleteOptions");
    private final static QName _HourlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "HourlyRecurrence");
    private final static QName _TriggeredSendExclusionList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendExclusionList");
    private final static QName _Send_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    private final static QName _YearlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "YearlyRecurrence");
    private final static QName _TriggeredSendCreateResult_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendCreateResult");
    private final static QName _CreateOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "CreateOptions");
    private final static QName _SendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinition");
    private final static QName _DeliveryProfile_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryProfile");
    private final static QName _Campaign_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Campaign");
    private final static QName _AudienceItem_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AudienceItem");
    private final static QName _ContentValidation_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ContentValidation");
    private final static QName _PrivateIP_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateIP");
    private final static QName _MonthlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MonthlyRecurrence");
    private final static QName _SubscriberList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberList");
    private final static QName _EmailSendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSendDefinition");
    private final static QName _WeeklyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "WeeklyRecurrence");
    private final static QName _TriggeredSendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinition");
    private final static QName _SubscriberResult_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberResult");
    private final static QName _AccountDataItemAccountType_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AccountType");
    private final static QName _AccountDataItemBrandID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "BrandID");
    private final static QName _AccountDataItemPrivateLabelID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateLabelID");
    private final static QName _AccountUserAccountUserID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AccountUserID");
    private final static QName _APIObjectObjectID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectID");
    private final static QName _APIObjectModifiedDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ModifiedDate");
    private final static QName _APIObjectPartnerKey_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerKey");
    private final static QName _AccountSubscription_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Subscription");
    private final static QName _UserAccessDescription_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private final static QName _UserAccessValue_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Value");
    private final static QName _UserAccessName_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private final static QName _SendNumberSent_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NumberSent");
    private final static QName _SendSentDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SentDate");
    private final static QName _SendNumberDelivered_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NumberDelivered");
    private final static QName _SubscriptionNotificationFlag_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationFlag");
    private final static QName _SubscriptionNotificationExpDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationExpDate");
    private final static QName _SubscriptionNotificationTitle_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationTitle");
    private final static QName _SubscriptionForAccounting_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ForAccounting");
    private final static QName _SubscriptionNotes_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Notes");
    private final static QName _SubscriptionNotificationMessage_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationMessage");
    private final static QName _SubscriptionSubscriptionID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriptionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exacttarget.wsdl.partnerapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveRequest }
     * 
     */
    public RetrieveRequest createRetrieveRequest() {
        return new RetrieveRequest();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link QueryObject }
     * 
     */
    public QueryObject createQueryObject() {
        return new QueryObject();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ScheduleResponseMsg.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleResponseMsg.Results createScheduleResponseMsgResults() {
        return new com.exacttarget.wsdl.partnerapi.ScheduleResponseMsg.Results();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors createDataExtensionUpdateResultValueErrors() {
        return new com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors();
    }

    /**
     * Create an instance of {@link SystemStatusResult }
     * 
     */
    public SystemStatusResult createSystemStatusResult() {
        return new SystemStatusResult();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors createDataExtensionCreateResultValueErrors() {
        return new com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors();
    }

    /**
     * Create an instance of {@link DefinitionResponseMsg }
     * 
     */
    public DefinitionResponseMsg createDefinitionResponseMsg() {
        return new DefinitionResponseMsg();
    }

    /**
     * Create an instance of {@link RetrieveSingleRequest }
     * 
     */
    public RetrieveSingleRequest createRetrieveSingleRequest() {
        return new RetrieveSingleRequest();
    }

    /**
     * Create an instance of {@link AudienceItem }
     * 
     */
    public AudienceItem createAudienceItem() {
        return new AudienceItem();
    }

    /**
     * Create an instance of {@link Configurations }
     * 
     */
    public Configurations createConfigureRequestMsgConfigurations() {
        return new Configurations();
    }

    /**
     * Create an instance of {@link UpdateResult }
     * 
     */
    public UpdateResult createUpdateResult() {
        return new UpdateResult();
    }

    /**
     * Create an instance of {@link QueryDefinition }
     * 
     */
    public QueryDefinition createQueryDefinition() {
        return new QueryDefinition();
    }

    /**
     * Create an instance of {@link DeliveryProfile }
     * 
     */
    public DeliveryProfile createDeliveryProfile() {
        return new DeliveryProfile();
    }

    /**
     * Create an instance of {@link PrivateLabel }
     * 
     */
    public PrivateLabel createPrivateLabel() {
        return new PrivateLabel();
    }

    /**
     * Create an instance of {@link EmailAddress }
     * 
     */
    public EmailAddress createEmailAddress() {
        return new EmailAddress();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.PerformResponseMsg.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.PerformResponseMsg.Results createPerformResponseMsgResults() {
        return new com.exacttarget.wsdl.partnerapi.PerformResponseMsg.Results();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.DataExtensionDeleteResult.KeyErrors }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionDeleteResult.KeyErrors createDataExtensionDeleteResultKeyErrors() {
        return new com.exacttarget.wsdl.partnerapi.DataExtensionDeleteResult.KeyErrors();
    }

    /**
     * Create an instance of {@link QueryRequestMsg }
     * 
     */
    public QueryRequestMsg createQueryRequestMsg() {
        return new QueryRequestMsg();
    }

    /**
     * Create an instance of {@link UserMap }
     * 
     */
    public UserMap createUserMap() {
        return new UserMap();
    }

    /**
     * Create an instance of {@link PrivateDomain }
     * 
     */
    public PrivateDomain createPrivateDomain() {
        return new PrivateDomain();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.PerformRequestMsg.Definitions }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.PerformRequestMsg.Definitions createPerformRequestMsgDefinitions() {
        return new com.exacttarget.wsdl.partnerapi.PerformRequestMsg.Definitions();
    }

    /**
     * Create an instance of {@link PublicationSubscriber }
     * 
     */
    public PublicationSubscriber createPublicationSubscriber() {
        return new PublicationSubscriber();
    }

    /**
     * Create an instance of {@link APIObject }
     * 
     */
    public APIObject createAPIObject() {
        return new APIObject();
    }

    /**
     * Create an instance of {@link TaskResult }
     * 
     */
    public TaskResult createTaskResult() {
        return new TaskResult();
    }

    /**
     * Create an instance of {@link SystemStatusOptions }
     * 
     */
    public SystemStatusOptions createSystemStatusOptions() {
        return new SystemStatusOptions();
    }

    /**
     * Create an instance of {@link HourlyRecurrence }
     * 
     */
    public HourlyRecurrence createHourlyRecurrence() {
        return new HourlyRecurrence();
    }

    /**
     * Create an instance of {@link SMSTriggeredSend }
     * 
     */
    public SMSTriggeredSend createSMSTriggeredSend() {
        return new SMSTriggeredSend();
    }

    /**
     * Create an instance of {@link ComplexFilterPart }
     * 
     */
    public ComplexFilterPart createComplexFilterPart() {
        return new ComplexFilterPart();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link ImportResultsSummary }
     * 
     */
    public ImportResultsSummary createImportResultsSummary() {
        return new ImportResultsSummary();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ConfigureResponseMsg.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ConfigureResponseMsg.Results createConfigureResponseMsgResults() {
        return new com.exacttarget.wsdl.partnerapi.ConfigureResponseMsg.Results();
    }

    /**
     * Create an instance of {@link SubscriberSendResult }
     * 
     */
    public SubscriberSendResult createSubscriberSendResult() {
        return new SubscriberSendResult();
    }

    /**
     * Create an instance of {@link DataExtensionTemplate }
     * 
     */
    public DataExtensionTemplate createDataExtensionTemplate() {
        return new DataExtensionTemplate();
    }

    /**
     * Create an instance of {@link SystemStatusRequestMsg }
     * 
     */
    public SystemStatusRequestMsg createSystemStatusRequestMsg() {
        return new SystemStatusRequestMsg();
    }

    /**
     * Create an instance of {@link ScheduleResponse }
     * 
     */
    public ScheduleResponse createScheduleResponse() {
        return new ScheduleResponse();
    }

    /**
     * Create an instance of {@link ExecuteRequestMsg }
     * 
     */
    public ExecuteRequestMsg createExecuteRequestMsg() {
        return new ExecuteRequestMsg();
    }

    /**
     * Create an instance of {@link SendClassification }
     * 
     */
    public SendClassification createSendClassification() {
        return new SendClassification();
    }

    /**
     * Create an instance of {@link ValidationResult }
     * 
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link TrackingUsers }
     * 
     */
    public TrackingUsers createEmailSendDefinitionTrackingUsers() {
        return new TrackingUsers();
    }

    /**
     * Create an instance of {@link ContainerID }
     * 
     */
    public ContainerID createContainerID() {
        return new ContainerID();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link ContentValidationTaskResult }
     * 
     */
    public ContentValidationTaskResult createContentValidationTaskResult() {
        return new ContentValidationTaskResult();
    }

    /**
     * Create an instance of {@link ObjectDefinitionRequest }
     * 
     */
    public ObjectDefinitionRequest createObjectDefinitionRequest() {
        return new ObjectDefinitionRequest();
    }

    /**
     * Create an instance of {@link GroupDefinition }
     * 
     */
    public GroupDefinition createGroupDefinition() {
        return new GroupDefinition();
    }

    /**
     * Create an instance of {@link ExtractResult }
     * 
     */
    public ExtractResult createExtractResult() {
        return new ExtractResult();
    }

    /**
     * Create an instance of {@link ExecuteRequest }
     * 
     */
    public ExecuteRequest createExecuteRequest() {
        return new ExecuteRequest();
    }

    /**
     * Create an instance of {@link VersionInfoResponseMsg }
     * 
     */
    public VersionInfoResponseMsg createVersionInfoResponseMsg() {
        return new VersionInfoResponseMsg();
    }

    /**
     * Create an instance of {@link EmailSendDefinition }
     * 
     */
    public EmailSendDefinition createEmailSendDefinition() {
        return new EmailSendDefinition();
    }

    /**
     * Create an instance of {@link PerformOptions }
     * 
     */
    public PerformOptions createPerformOptions() {
        return new PerformOptions();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link RetrieveRequestMsg }
     * 
     */
    public RetrieveRequestMsg createRetrieveRequestMsg() {
        return new RetrieveRequestMsg();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.PerformResponse.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.PerformResponse.Results createPerformResponseResults() {
        return new com.exacttarget.wsdl.partnerapi.PerformResponse.Results();
    }

    /**
     * Create an instance of {@link SaveOptions }
     * 
     */
    public SaveOptions createOptionsSaveOptions() {
        return new SaveOptions();
    }

    /**
     * Create an instance of {@link InteractionDefinition }
     * 
     */
    public InteractionDefinition createInteractionDefinition() {
        return new InteractionDefinition();
    }

    /**
     * Create an instance of {@link ValidationOptions }
     * 
     */
    public ValidationOptions createValidationActionValidationOptions() {
        return new ValidationOptions();
    }

    /**
     * Create an instance of {@link PublicKeyManagement }
     * 
     */
    public PublicKeyManagement createPublicKeyManagement() {
        return new PublicKeyManagement();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.Publication.Subscribers }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.Publication.Subscribers createPublicationSubscribers() {
        return new com.exacttarget.wsdl.partnerapi.Publication.Subscribers();
    }

    /**
     * Create an instance of {@link ScheduleRequestMsg }
     * 
     */
    public ScheduleRequestMsg createScheduleRequestMsg() {
        return new ScheduleRequestMsg();
    }

    /**
     * Create an instance of {@link Outages }
     * 
     */
    public Outages createSystemStatusResultOutages() {
        return new Outages();
    }

    /**
     * Create an instance of {@link SendDefinitionList }
     * 
     */
    public SendDefinitionList createSendDefinitionList() {
        return new SendDefinitionList();
    }

    /**
     * Create an instance of {@link TriggeredSendSummary }
     * 
     */
    public TriggeredSendSummary createTriggeredSendSummary() {
        return new TriggeredSendSummary();
    }

    /**
     * Create an instance of {@link UpdateOptions }
     * 
     */
    public UpdateOptions createUpdateOptions() {
        return new UpdateOptions();
    }

    /**
     * Create an instance of {@link SpamAssassinValidation }
     * 
     */
    public SpamAssassinValidation createSpamAssassinValidation() {
        return new SpamAssassinValidation();
    }

    /**
     * Create an instance of {@link ImportDefinition }
     * 
     */
    public ImportDefinition createImportDefinition() {
        return new ImportDefinition();
    }

    /**
     * Create an instance of {@link ForwardedEmailEvent }
     * 
     */
    public ForwardedEmailEvent createForwardedEmailEvent() {
        return new ForwardedEmailEvent();
    }

    /**
     * Create an instance of {@link AsyncResponse }
     * 
     */
    public AsyncResponse createAsyncResponse() {
        return new AsyncResponse();
    }

    /**
     * Create an instance of {@link QueryRequest }
     * 
     */
    public QueryRequest createQueryRequest() {
        return new QueryRequest();
    }

    /**
     * Create an instance of {@link AsyncRequestResult }
     * 
     */
    public AsyncRequestResult createAsyncRequestResult() {
        return new AsyncRequestResult();
    }

    /**
     * Create an instance of {@link PerformRequest }
     * 
     */
    public PerformRequest createPerformRequest() {
        return new PerformRequest();
    }

    /**
     * Create an instance of {@link CompressionConfiguration }
     * 
     */
    public CompressionConfiguration createCompressionConfiguration() {
        return new CompressionConfiguration();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters createExtractRequestParameters() {
        return new com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters();
    }

    /**
     * Create an instance of {@link SubscriberAddress }
     * 
     */
    public SubscriberAddress createSubscriberAddress() {
        return new SubscriberAddress();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link PicklistItem }
     * 
     */
    public PicklistItem createPicklistItem() {
        return new PicklistItem();
    }

    /**
     * Create an instance of {@link AccountDataItem }
     * 
     */
    public AccountDataItem createAccountDataItem() {
        return new AccountDataItem();
    }

    /**
     * Create an instance of {@link ParameterDescription }
     * 
     */
    public ParameterDescription createParameterDescription() {
        return new ParameterDescription();
    }

    /**
     * Create an instance of {@link SubscriberTypeDefinition }
     * 
     */
    public SubscriberTypeDefinition createSubscriberTypeDefinition() {
        return new SubscriberTypeDefinition();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link AdditionalOperands }
     * 
     */
    public AdditionalOperands createComplexFilterPartAdditionalOperands() {
        return new AdditionalOperands();
    }

    /**
     * Create an instance of {@link TrackingUser }
     * 
     */
    public TrackingUser createTrackingUser() {
        return new TrackingUser();
    }

    /**
     * Create an instance of {@link SystemStatusResponseMsg }
     * 
     */
    public SystemStatusResponseMsg createSystemStatusResponseMsg() {
        return new SystemStatusResponseMsg();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters createSendDefinitionListParameters() {
        return new com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters();
    }

    /**
     * Create an instance of {@link ValidationResults }
     * 
     */
    public ValidationResults createContentValidationTaskResultValidationResults() {
        return new ValidationResults();
    }

    /**
     * Create an instance of {@link ContentValidation }
     * 
     */
    public ContentValidation createContentValidation() {
        return new ContentValidation();
    }

    /**
     * Create an instance of {@link DailyRecurrence }
     * 
     */
    public DailyRecurrence createDailyRecurrence() {
        return new DailyRecurrence();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ExtractOptions }
     * 
     */
    public ExtractOptions createExtractOptions() {
        return new ExtractOptions();
    }

    /**
     * Create an instance of {@link TriggeredSendDefinition }
     * 
     */
    public TriggeredSendDefinition createTriggeredSendDefinition() {
        return new TriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link AddressStatus }
     * 
     */
    public AddressStatus createAddressStatus() {
        return new AddressStatus();
    }

    /**
     * Create an instance of {@link ListSend }
     * 
     */
    public ListSend createListSend() {
        return new ListSend();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ObjectExtension }
     * 
     */
    public ObjectExtension createObjectExtension() {
        return new ObjectExtension();
    }

    /**
     * Create an instance of {@link NullAPIProperty }
     * 
     */
    public NullAPIProperty createNullAPIProperty() {
        return new NullAPIProperty();
    }

    /**
     * Create an instance of {@link SendSummary }
     * 
     */
    public SendSummary createSendSummary() {
        return new SendSummary();
    }

    /**
     * Create an instance of {@link UnsubEvent }
     * 
     */
    public UnsubEvent createUnsubEvent() {
        return new UnsubEvent();
    }

    /**
     * Create an instance of {@link DefinitionRequestMsg }
     * 
     */
    public DefinitionRequestMsg createDefinitionRequestMsg() {
        return new DefinitionRequestMsg();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link ObjectDefinition }
     * 
     */
    public ObjectDefinition createObjectDefinition() {
        return new ObjectDefinition();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link ResultMessage }
     * 
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link FilterPart }
     * 
     */
    public FilterPart createFilterPart() {
        return new FilterPart();
    }

    /**
     * Create an instance of {@link ForwardedEmailOptInEvent }
     * 
     */
    public ForwardedEmailOptInEvent createForwardedEmailOptInEvent() {
        return new ForwardedEmailOptInEvent();
    }

    /**
     * Create an instance of {@link ReplyMailManagementConfiguration }
     * 
     */
    public ReplyMailManagementConfiguration createReplyMailManagementConfiguration() {
        return new ReplyMailManagementConfiguration();
    }

    /**
     * Create an instance of {@link VersionInfoResponse }
     * 
     */
    public VersionInfoResponse createVersionInfoResponse() {
        return new VersionInfoResponse();
    }

    /**
     * Create an instance of {@link SendDefinition }
     * 
     */
    public SendDefinition createSendDefinition() {
        return new SendDefinition();
    }

    /**
     * Create an instance of {@link PrivateIP }
     * 
     */
    public PrivateIP createPrivateIP() {
        return new PrivateIP();
    }

    /**
     * Create an instance of {@link DataExtension }
     * 
     */
    public DataExtension createDataExtension() {
        return new DataExtension();
    }

    /**
     * Create an instance of {@link TrackingEvent }
     * 
     */
    public TrackingEvent createTrackingEvent() {
        return new TrackingEvent();
    }

    /**
     * Create an instance of {@link InteractionBaseObject }
     * 
     */
    public InteractionBaseObject createInteractionBaseObject() {
        return new InteractionBaseObject();
    }

    /**
     * Create an instance of {@link SystemOutage }
     * 
     */
    public SystemOutage createSystemOutage() {
        return new SystemOutage();
    }

    /**
     * Create an instance of {@link PropertyDefinition }
     * 
     */
    public PropertyDefinition createPropertyDefinition() {
        return new PropertyDefinition();
    }

    /**
     * Create an instance of {@link SMSAddress }
     * 
     */
    public SMSAddress createSMSAddress() {
        return new SMSAddress();
    }

    /**
     * Create an instance of {@link SentEvent }
     * 
     */
    public SentEvent createSentEvent() {
        return new SentEvent();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors createDataExtensionUpdateResultKeyErrors() {
        return new com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link PerformRequestMsg }
     * 
     */
    public PerformRequestMsg createPerformRequestMsg() {
        return new PerformRequestMsg();
    }

    /**
     * Create an instance of {@link Statuses }
     * 
     */
    public Statuses createSubscriberAddressStatuses() {
        return new Statuses();
    }

    /**
     * Create an instance of {@link FileTransferActivity }
     * 
     */
    public FileTransferActivity createFileTransferActivity() {
        return new FileTransferActivity();
    }

    /**
     * Create an instance of {@link UsernameAuthentication }
     * 
     */
    public UsernameAuthentication createUsernameAuthentication() {
        return new UsernameAuthentication();
    }

    /**
     * Create an instance of {@link TagFilterPart }
     * 
     */
    public TagFilterPart createTagFilterPart() {
        return new TagFilterPart();
    }

    /**
     * Create an instance of {@link MonthlyRecurrence }
     * 
     */
    public MonthlyRecurrence createMonthlyRecurrence() {
        return new MonthlyRecurrence();
    }

    /**
     * Create an instance of {@link Interactions }
     * 
     */
    public Interactions createScheduleRequestMsgInteractions() {
        return new Interactions();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors createDataExtensionCreateResultKeyErrors() {
        return new com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors();
    }

    /**
     * Create an instance of {@link ValidationAction }
     * 
     */
    public ValidationAction createValidationAction() {
        return new ValidationAction();
    }

    /**
     * Create an instance of {@link ArrayOfObjectDefinitionRequest }
     * 
     */
    public ArrayOfObjectDefinitionRequest createArrayOfObjectDefinitionRequest() {
        return new ArrayOfObjectDefinitionRequest();
    }

    /**
     * Create an instance of {@link RetrieveResponseMsg }
     * 
     */
    public RetrieveResponseMsg createRetrieveResponseMsg() {
        return new RetrieveResponseMsg();
    }

    /**
     * Create an instance of {@link VoiceTriggeredSend }
     * 
     */
    public VoiceTriggeredSend createVoiceTriggeredSend() {
        return new VoiceTriggeredSend();
    }

    /**
     * Create an instance of {@link Retrieves }
     * 
     */
    public Retrieves createRetrieveRequestRetrieves() {
        return new Retrieves();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters createExtractDefinitionParameters() {
        return new com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link ExtractDescription }
     * 
     */
    public ExtractDescription createExtractDescription() {
        return new ExtractDescription();
    }

    /**
     * Create an instance of {@link SaveOption }
     * 
     */
    public SaveOption createSaveOption() {
        return new SaveOption();
    }

    /**
     * Create an instance of {@link SurveyEvent }
     * 
     */
    public SurveyEvent createSurveyEvent() {
        return new SurveyEvent();
    }

    /**
     * Create an instance of {@link BrandTag }
     * 
     */
    public BrandTag createBrandTag() {
        return new BrandTag();
    }

    /**
     * Create an instance of {@link ExtractResponseMsg }
     * 
     */
    public ExtractResponseMsg createExtractResponseMsg() {
        return new ExtractResponseMsg();
    }

    /**
     * Create an instance of {@link MessagingConfiguration }
     * 
     */
    public MessagingConfiguration createMessagingConfiguration() {
        return new MessagingConfiguration();
    }

    /**
     * Create an instance of {@link APIProperty }
     * 
     */
    public APIProperty createAPIProperty() {
        return new APIProperty();
    }

    /**
     * Create an instance of {@link ConfigureResponseMsg }
     * 
     */
    public ConfigureResponseMsg createConfigureResponseMsg() {
        return new ConfigureResponseMsg();
    }

    /**
     * Create an instance of {@link LinkSend }
     * 
     */
    public LinkSend createLinkSend() {
        return new LinkSend();
    }

    /**
     * Create an instance of {@link AccountUser }
     * 
     */
    public AccountUser createAccountUser() {
        return new AccountUser();
    }

    /**
     * Create an instance of {@link CreateOptions }
     * 
     */
    public CreateOptions createCreateOptions() {
        return new CreateOptions();
    }

    /**
     * Create an instance of {@link ClientID }
     * 
     */
    public ClientID createClientID() {
        return new ClientID();
    }

    /**
     * Create an instance of {@link DataExtensionDeleteResult }
     * 
     */
    public DataExtensionDeleteResult createDataExtensionDeleteResult() {
        return new DataExtensionDeleteResult();
    }

    /**
     * Create an instance of {@link Addresses }
     * 
     */
    public Addresses createSubscriberAddresses() {
        return new Addresses();
    }

    /**
     * Create an instance of {@link GlobalUnsubscribeCategory }
     * 
     */
    public GlobalUnsubscribeCategory createGlobalUnsubscribeCategory() {
        return new GlobalUnsubscribeCategory();
    }

    /**
     * Create an instance of {@link Portfolio }
     * 
     */
    public Portfolio createPortfolio() {
        return new Portfolio();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createObjectExtensionProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link ConfigureResult }
     * 
     */
    public ConfigureResult createConfigureResult() {
        return new ConfigureResult();
    }

    /**
     * Create an instance of {@link ScheduleDefinition }
     * 
     */
    public ScheduleDefinition createScheduleDefinition() {
        return new ScheduleDefinition();
    }

    /**
     * Create an instance of {@link IntegrationProfile }
     * 
     */
    public IntegrationProfile createIntegrationProfile() {
        return new IntegrationProfile();
    }

    /**
     * Create an instance of {@link VersionInfoRequestMsg }
     * 
     */
    public VersionInfoRequestMsg createVersionInfoRequestMsg() {
        return new VersionInfoRequestMsg();
    }

    /**
     * Create an instance of {@link SenderProfile }
     * 
     */
    public SenderProfile createSenderProfile() {
        return new SenderProfile();
    }

    /**
     * Create an instance of {@link ClickEvent }
     * 
     */
    public ClickEvent createClickEvent() {
        return new ClickEvent();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.Parameters }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.Parameters createParameters() {
        return new com.exacttarget.wsdl.partnerapi.Parameters();
    }

    /**
     * Create an instance of {@link DataExtensionError }
     * 
     */
    public DataExtensionError createDataExtensionError() {
        return new DataExtensionError();
    }

    /**
     * Create an instance of {@link DataExtensionField }
     * 
     */
    public DataExtensionField createDataExtensionField() {
        return new DataExtensionField();
    }

    /**
     * Create an instance of {@link ExtractTemplate }
     * 
     */
    public ExtractTemplate createExtractTemplate() {
        return new ExtractTemplate();
    }

    /**
     * Create an instance of {@link TriggeredSendCreateResult }
     * 
     */
    public TriggeredSendCreateResult createTriggeredSendCreateResult() {
        return new TriggeredSendCreateResult();
    }

    /**
     * Create an instance of {@link RetrieveOptions }
     * 
     */
    public RetrieveOptions createRetrieveOptions() {
        return new RetrieveOptions();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.PerformRequest.Definitions }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.PerformRequest.Definitions createPerformRequestDefinitions() {
        return new com.exacttarget.wsdl.partnerapi.PerformRequest.Definitions();
    }

    /**
     * Create an instance of {@link AttributeMap }
     * 
     */
    public AttributeMap createAttributeMap() {
        return new AttributeMap();
    }

    /**
     * Create an instance of {@link QueryResponseMsg }
     * 
     */
    public QueryResponseMsg createQueryResponseMsg() {
        return new QueryResponseMsg();
    }

    /**
     * Create an instance of {@link Tags }
     * 
     */
    public Tags createTagFilterPartTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link DataExtensionUpdateResult }
     * 
     */
    public DataExtensionUpdateResult createDataExtensionUpdateResult() {
        return new DataExtensionUpdateResult();
    }

    /**
     * Create an instance of {@link BusinessRule }
     * 
     */
    public BusinessRule createBusinessRule() {
        return new BusinessRule();
    }

    /**
     * Create an instance of {@link MessageSendActivity }
     * 
     */
    public MessageSendActivity createMessageSendActivity() {
        return new MessageSendActivity();
    }

    /**
     * Create an instance of {@link ExtractParameterDescription }
     * 
     */
    public ExtractParameterDescription createExtractParameterDescription() {
        return new ExtractParameterDescription();
    }

    /**
     * Create an instance of {@link UserAccess }
     * 
     */
    public UserAccess createUserAccess() {
        return new UserAccess();
    }

    /**
     * Create an instance of {@link ResourceSpecification }
     * 
     */
    public ResourceSpecification createResourceSpecification() {
        return new ResourceSpecification();
    }

    /**
     * Create an instance of {@link DeleteOptions }
     * 
     */
    public DeleteOptions createDeleteOptions() {
        return new DeleteOptions();
    }

    /**
     * Create an instance of {@link SmsSendActivity }
     * 
     */
    public SmsSendActivity createSmsSendActivity() {
        return new SmsSendActivity();
    }

    /**
     * Create an instance of {@link PerformResponseMsg }
     * 
     */
    public PerformResponseMsg createPerformResponseMsg() {
        return new PerformResponseMsg();
    }

    /**
     * Create an instance of {@link CampaignPerformOptions }
     * 
     */
    public CampaignPerformOptions createCampaignPerformOptions() {
        return new CampaignPerformOptions();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.SystemStatusResponseMsg.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.SystemStatusResponseMsg.Results createSystemStatusResponseMsgResults() {
        return new com.exacttarget.wsdl.partnerapi.SystemStatusResponseMsg.Results();
    }

    /**
     * Create an instance of {@link SMSTriggeredSendDefinition }
     * 
     */
    public SMSTriggeredSendDefinition createSMSTriggeredSendDefinition() {
        return new SMSTriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link ExecuteResponseMsg }
     * 
     */
    public ExecuteResponseMsg createExecuteResponseMsg() {
        return new ExecuteResponseMsg();
    }

    /**
     * Create an instance of {@link OpenEvent }
     * 
     */
    public OpenEvent createOpenEvent() {
        return new OpenEvent();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link ContentArea }
     * 
     */
    public ContentArea createContentArea() {
        return new ContentArea();
    }

    /**
     * Create an instance of {@link Sources }
     * 
     */
    public Sources createSendSources() {
        return new Sources();
    }

    /**
     * Create an instance of {@link CreateRequest }
     * 
     */
    public CreateRequest createCreateRequest() {
        return new CreateRequest();
    }

    /**
     * Create an instance of {@link Fields }
     * 
     */
    public Fields createDataExtensionFields() {
        return new Fields();
    }

    /**
     * Create an instance of {@link ConfigureOptions }
     * 
     */
    public ConfigureOptions createConfigureOptions() {
        return new ConfigureOptions();
    }

    /**
     * Create an instance of {@link FilterDefinition }
     * 
     */
    public FilterDefinition createFilterDefinition() {
        return new FilterDefinition();
    }

    /**
     * Create an instance of {@link RetrieveSingleOptions }
     * 
     */
    public RetrieveSingleOptions createRetrieveSingleOptions() {
        return new RetrieveSingleOptions();
    }

    /**
     * Create an instance of {@link SimpleFilterPart }
     * 
     */
    public SimpleFilterPart createSimpleFilterPart() {
        return new SimpleFilterPart();
    }

    /**
     * Create an instance of {@link TriggeredSend }
     * 
     */
    public TriggeredSend createTriggeredSend() {
        return new TriggeredSend();
    }

    /**
     * Create an instance of {@link NotSentEvent }
     * 
     */
    public NotSentEvent createNotSentEvent() {
        return new NotSentEvent();
    }

    /**
     * Create an instance of {@link ScheduleOptions }
     * 
     */
    public ScheduleOptions createScheduleOptions() {
        return new ScheduleOptions();
    }

    /**
     * Create an instance of {@link DataExtensionObject }
     * 
     */
    public DataExtensionObject createDataExtensionObject() {
        return new DataExtensionObject();
    }

    /**
     * Create an instance of {@link ScheduleResult }
     * 
     */
    public ScheduleResult createScheduleResult() {
        return new ScheduleResult();
    }

    /**
     * Create an instance of {@link PerformResponse }
     * 
     */
    public PerformResponse createPerformResponse() {
        return new PerformResponse();
    }

    /**
     * Create an instance of {@link IntegrationProfileDefinition }
     * 
     */
    public IntegrationProfileDefinition createIntegrationProfileDefinition() {
        return new IntegrationProfileDefinition();
    }

    /**
     * Create an instance of {@link SubscriberResult }
     * 
     */
    public SubscriberResult createSubscriberResult() {
        return new SubscriberResult();
    }

    /**
     * Create an instance of {@link ExtractDefinition }
     * 
     */
    public ExtractDefinition createExtractDefinition() {
        return new ExtractDefinition();
    }

    /**
     * Create an instance of {@link FieldMap }
     * 
     */
    public FieldMap createFieldMap() {
        return new FieldMap();
    }

    /**
     * Create an instance of {@link FieldMaps }
     * 
     */
    public FieldMaps createImportDefinitionFieldMaps() {
        return new FieldMaps();
    }

    /**
     * Create an instance of {@link TriggeredSendExclusionList }
     * 
     */
    public TriggeredSendExclusionList createTriggeredSendExclusionList() {
        return new TriggeredSendExclusionList();
    }

    /**
     * Create an instance of {@link ScheduleResponseMsg }
     * 
     */
    public ScheduleResponseMsg createScheduleResponseMsg() {
        return new ScheduleResponseMsg();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link MessagingVendorKind }
     * 
     */
    public MessagingVendorKind createMessagingVendorKind() {
        return new MessagingVendorKind();
    }

    /**
     * Create an instance of {@link PicklistItems }
     * 
     */
    public PicklistItems createPropertyDefinitionPicklistItems() {
        return new PicklistItems();
    }

    /**
     * Create an instance of {@link ExtractRequestMsg }
     * 
     */
    public ExtractRequestMsg createExtractRequestMsg() {
        return new ExtractRequestMsg();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link SubscriberList }
     * 
     */
    public SubscriberList createSubscriberList() {
        return new SubscriberList();
    }

    /**
     * Create an instance of {@link ContentValidationResult }
     * 
     */
    public ContentValidationResult createContentValidationResult() {
        return new ContentValidationResult();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters createExtractDescriptionParameters() {
        return new com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters();
    }

    /**
     * Create an instance of {@link ImportDefinitionFieldMap }
     * 
     */
    public ImportDefinitionFieldMap createImportDefinitionFieldMap() {
        return new ImportDefinitionFieldMap();
    }

    /**
     * Create an instance of {@link DataExtensionCreateResult }
     * 
     */
    public DataExtensionCreateResult createDataExtensionCreateResult() {
        return new DataExtensionCreateResult();
    }

    /**
     * Create an instance of {@link ListSubscriber }
     * 
     */
    public ListSubscriber createListSubscriber() {
        return new ListSubscriber();
    }

    /**
     * Create an instance of {@link ExtendedProperties }
     * 
     */
    public ExtendedProperties createObjectDefinitionExtendedProperties() {
        return new ExtendedProperties();
    }

    /**
     * Create an instance of {@link FileTransferLocation }
     * 
     */
    public FileTransferLocation createFileTransferLocation() {
        return new FileTransferLocation();
    }

    /**
     * Create an instance of {@link ResultItem }
     * 
     */
    public ResultItem createResultItem() {
        return new ResultItem();
    }

    /**
     * Create an instance of {@link DataExtractActivity }
     * 
     */
    public DataExtractActivity createDataExtractActivity() {
        return new DataExtractActivity();
    }

    /**
     * Create an instance of {@link BounceEvent }
     * 
     */
    public BounceEvent createBounceEvent() {
        return new BounceEvent();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Keys }
     * 
     */
    public Keys createDataExtensionObjectKeys() {
        return new Keys();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers createContentValidationSubscribers() {
        return new com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers();
    }

    /**
     * Create an instance of {@link CreateResult }
     * 
     */
    public CreateResult createCreateResult() {
        return new CreateResult();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link ExtractParameter }
     * 
     */
    public ExtractParameter createExtractParameter() {
        return new ExtractParameter();
    }

    /**
     * Create an instance of {@link PerformResult }
     * 
     */
    public PerformResult createPerformResult() {
        return new PerformResult();
    }

    /**
     * Create an instance of {@link AccountPrivateLabel }
     * 
     */
    public AccountPrivateLabel createAccountPrivateLabel() {
        return new AccountPrivateLabel();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link ExtractRequest }
     * 
     */
    public ExtractRequest createExtractRequest() {
        return new ExtractRequest();
    }

    /**
     * Create an instance of {@link com.exacttarget.wsdl.partnerapi.ScheduleResponse.Results }
     * 
     */
    public com.exacttarget.wsdl.partnerapi.ScheduleResponse.Results createScheduleResponseResults() {
        return new com.exacttarget.wsdl.partnerapi.ScheduleResponse.Results();
    }

    /**
     * Create an instance of {@link VoiceTriggeredSendDefinition }
     * 
     */
    public VoiceTriggeredSendDefinition createVoiceTriggeredSendDefinition() {
        return new VoiceTriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link ReportActivity }
     * 
     */
    public ReportActivity createReportActivity() {
        return new ReportActivity();
    }

    /**
     * Create an instance of {@link References }
     * 
     */
    public References createPropertyDefinitionReferences() {
        return new References();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link WeeklyRecurrence }
     * 
     */
    public WeeklyRecurrence createWeeklyRecurrence() {
        return new WeeklyRecurrence();
    }

    /**
     * Create an instance of {@link YearlyRecurrence }
     * 
     */
    public YearlyRecurrence createYearlyRecurrence() {
        return new YearlyRecurrence();
    }

    /**
     * Create an instance of {@link ConfigureRequestMsg }
     * 
     */
    public ConfigureRequestMsg createConfigureRequestMsg() {
        return new ConfigureRequestMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Subscriber")
    public JAXBElement<Subscriber> createSubscriber(Subscriber value) {
        return new JAXBElement<Subscriber>(_Subscriber_QNAME, Subscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateDomain")
    public JAXBElement<PrivateDomain> createPrivateDomain(PrivateDomain value) {
        return new JAXBElement<PrivateDomain>(_PrivateDomain_QNAME, PrivateDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SenderProfile")
    public JAXBElement<SenderProfile> createSenderProfile(SenderProfile value) {
        return new JAXBElement<SenderProfile>(_SenderProfile_QNAME, SenderProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "List")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyRecurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DailyRecurrence")
    public JAXBElement<DailyRecurrence> createDailyRecurrence(DailyRecurrence value) {
        return new JAXBElement<DailyRecurrence>(_DailyRecurrence_QNAME, DailyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSend")
    public JAXBElement<TriggeredSend> createTriggeredSend(TriggeredSend value) {
        return new JAXBElement<TriggeredSend>(_TriggeredSend_QNAME, TriggeredSend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "UpdateOptions")
    public JAXBElement<UpdateOptions> createUpdateOptions(UpdateOptions value) {
        return new JAXBElement<UpdateOptions>(_UpdateOptions_QNAME, UpdateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDefinitionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SendDefinitionList")
    public JAXBElement<SendDefinitionList> createSendDefinitionList(SendDefinitionList value) {
        return new JAXBElement<SendDefinitionList>(_SendDefinitionList_QNAME, SendDefinitionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DeleteOptions")
    public JAXBElement<DeleteOptions> createDeleteOptions(DeleteOptions value) {
        return new JAXBElement<DeleteOptions>(_DeleteOptions_QNAME, DeleteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HourlyRecurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "HourlyRecurrence")
    public JAXBElement<HourlyRecurrence> createHourlyRecurrence(HourlyRecurrence value) {
        return new JAXBElement<HourlyRecurrence>(_HourlyRecurrence_QNAME, HourlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendExclusionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendExclusionList")
    public JAXBElement<TriggeredSendExclusionList> createTriggeredSendExclusionList(TriggeredSendExclusionList value) {
        return new JAXBElement<TriggeredSendExclusionList>(_TriggeredSendExclusionList_QNAME, TriggeredSendExclusionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Send }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Send")
    public JAXBElement<Send> createSend(Send value) {
        return new JAXBElement<Send>(_Send_QNAME, Send.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyRecurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "YearlyRecurrence")
    public JAXBElement<YearlyRecurrence> createYearlyRecurrence(YearlyRecurrence value) {
        return new JAXBElement<YearlyRecurrence>(_YearlyRecurrence_QNAME, YearlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendCreateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendCreateResult")
    public JAXBElement<TriggeredSendCreateResult> createTriggeredSendCreateResult(TriggeredSendCreateResult value) {
        return new JAXBElement<TriggeredSendCreateResult>(_TriggeredSendCreateResult_QNAME, TriggeredSendCreateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "CreateOptions")
    public JAXBElement<CreateOptions> createCreateOptions(CreateOptions value) {
        return new JAXBElement<CreateOptions>(_CreateOptions_QNAME, CreateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SendDefinition")
    public JAXBElement<SendDefinition> createSendDefinition(SendDefinition value) {
        return new JAXBElement<SendDefinition>(_SendDefinition_QNAME, SendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DeliveryProfile")
    public JAXBElement<DeliveryProfile> createDeliveryProfile(DeliveryProfile value) {
        return new JAXBElement<DeliveryProfile>(_DeliveryProfile_QNAME, DeliveryProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Campaign")
    public JAXBElement<Campaign> createCampaign(Campaign value) {
        return new JAXBElement<Campaign>(_Campaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AudienceItem")
    public JAXBElement<AudienceItem> createAudienceItem(AudienceItem value) {
        return new JAXBElement<AudienceItem>(_AudienceItem_QNAME, AudienceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ContentValidation")
    public JAXBElement<ContentValidation> createContentValidation(ContentValidation value) {
        return new JAXBElement<ContentValidation>(_ContentValidation_QNAME, ContentValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateIP")
    public JAXBElement<PrivateIP> createPrivateIP(PrivateIP value) {
        return new JAXBElement<PrivateIP>(_PrivateIP_QNAME, PrivateIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthlyRecurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MonthlyRecurrence")
    public JAXBElement<MonthlyRecurrence> createMonthlyRecurrence(MonthlyRecurrence value) {
        return new JAXBElement<MonthlyRecurrence>(_MonthlyRecurrence_QNAME, MonthlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriberList")
    public JAXBElement<SubscriberList> createSubscriberList(SubscriberList value) {
        return new JAXBElement<SubscriberList>(_SubscriberList_QNAME, SubscriberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSendDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "EmailSendDefinition")
    public JAXBElement<EmailSendDefinition> createEmailSendDefinition(EmailSendDefinition value) {
        return new JAXBElement<EmailSendDefinition>(_EmailSendDefinition_QNAME, EmailSendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeeklyRecurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "WeeklyRecurrence")
    public JAXBElement<WeeklyRecurrence> createWeeklyRecurrence(WeeklyRecurrence value) {
        return new JAXBElement<WeeklyRecurrence>(_WeeklyRecurrence_QNAME, WeeklyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendDefinition")
    public JAXBElement<TriggeredSendDefinition> createTriggeredSendDefinition(TriggeredSendDefinition value) {
        return new JAXBElement<TriggeredSendDefinition>(_TriggeredSendDefinition_QNAME, TriggeredSendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriberResult")
    public JAXBElement<SubscriberResult> createSubscriberResult(SubscriberResult value) {
        return new JAXBElement<SubscriberResult>(_SubscriberResult_QNAME, SubscriberResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AccountType", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemAccountType(Integer value) {
        return new JAXBElement<Integer>(_AccountDataItemAccountType_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "BrandID", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemBrandID(Integer value) {
        return new JAXBElement<Integer>(_AccountDataItemBrandID_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateLabelID", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemPrivateLabelID(Integer value) {
        return new JAXBElement<Integer>(_AccountDataItemPrivateLabelID_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AccountUserID", scope = AccountUser.class)
    public JAXBElement<Integer> createAccountUserAccountUserID(Integer value) {
        return new JAXBElement<Integer>(_AccountUserAccountUserID_QNAME, Integer.class, AccountUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ObjectID", scope = APIObject.class)
    public JAXBElement<String> createAPIObjectObjectID(String value) {
        return new JAXBElement<String>(_APIObjectObjectID_QNAME, String.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ModifiedDate", scope = APIObject.class)
    public JAXBElement<XMLGregorianCalendar> createAPIObjectModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APIObjectModifiedDate_QNAME, XMLGregorianCalendar.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PartnerKey", scope = APIObject.class)
    public JAXBElement<String> createAPIObjectPartnerKey(String value) {
        return new JAXBElement<String>(_APIObjectPartnerKey_QNAME, String.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Subscription", scope = Account.class)
    public JAXBElement<Subscription> createAccountSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_AccountSubscription_QNAME, Subscription.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Description", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessDescription(String value) {
        return new JAXBElement<String>(_UserAccessDescription_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Value", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessValue(String value) {
        return new JAXBElement<String>(_UserAccessValue_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Name", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessName(String value) {
        return new JAXBElement<String>(_UserAccessName_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberSent", scope = Send.class)
    public JAXBElement<Integer> createSendNumberSent(Integer value) {
        return new JAXBElement<Integer>(_SendNumberSent_QNAME, Integer.class, Send.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SentDate", scope = Send.class)
    public JAXBElement<XMLGregorianCalendar> createSendSentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SendSentDate_QNAME, XMLGregorianCalendar.class, Send.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberDelivered", scope = Send.class)
    public JAXBElement<Integer> createSendNumberDelivered(Integer value) {
        return new JAXBElement<Integer>(_SendNumberDelivered_QNAME, Integer.class, Send.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberSent", scope = ListSend.class)
    public JAXBElement<Integer> createListSendNumberSent(Integer value) {
        return new JAXBElement<Integer>(_SendNumberSent_QNAME, Integer.class, ListSend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberDelivered", scope = ListSend.class)
    public JAXBElement<Integer> createListSendNumberDelivered(Integer value) {
        return new JAXBElement<Integer>(_SendNumberDelivered_QNAME, Integer.class, ListSend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationFlag", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationFlag(String value) {
        return new JAXBElement<String>(_SubscriptionNotificationFlag_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationExpDate", scope = Subscription.class)
    public JAXBElement<XMLGregorianCalendar> createSubscriptionNotificationExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SubscriptionNotificationExpDate_QNAME, XMLGregorianCalendar.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationTitle", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationTitle(String value) {
        return new JAXBElement<String>(_SubscriptionNotificationTitle_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ForAccounting", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionForAccounting(String value) {
        return new JAXBElement<String>(_SubscriptionForAccounting_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Notes", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotes(String value) {
        return new JAXBElement<String>(_SubscriptionNotes_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationMessage", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationMessage(String value) {
        return new JAXBElement<String>(_SubscriptionNotificationMessage_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriptionID", scope = Subscription.class)
    public JAXBElement<Integer> createSubscriptionSubscriptionID(Integer value) {
        return new JAXBElement<Integer>(_SubscriptionSubscriptionID_QNAME, Integer.class, Subscription.class, value);
    }

}
