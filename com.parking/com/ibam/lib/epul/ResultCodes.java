
package com.ibam.lib.epul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="InvalidNumber"/&gt;
 *     &lt;enumeration value="InvalidParameters"/&gt;
 *     &lt;enumeration value="InvalidTerminal"/&gt;
 *     &lt;enumeration value="InvalidKey"/&gt;
 *     &lt;enumeration value="InvalidSignature"/&gt;
 *     &lt;enumeration value="InvalidUsernameOrPassword"/&gt;
 *     &lt;enumeration value="InvalidSession"/&gt;
 *     &lt;enumeration value="NoPriv"/&gt;
 *     &lt;enumeration value="LoginFailed"/&gt;
 *     &lt;enumeration value="InvalidVerifyCode"/&gt;
 *     &lt;enumeration value="NotPayeed"/&gt;
 *     &lt;enumeration value="PaymentDeclined"/&gt;
 *     &lt;enumeration value="Reversal"/&gt;
 *     &lt;enumeration value="TransactionIdAlreadyExists"/&gt;
 *     &lt;enumeration value="CustomerNotFound"/&gt;
 *     &lt;enumeration value="InvalidAmount"/&gt;
 *     &lt;enumeration value="InvalidCurrency"/&gt;
 *     &lt;enumeration value="TransactionIdNotFound"/&gt;
 *     &lt;enumeration value="AccessDeniedForDbItem"/&gt;
 *     &lt;enumeration value="EmailStillInUse"/&gt;
 *     &lt;enumeration value="PhoneStillInUse"/&gt;
 *     &lt;enumeration value="UserTempBlocked"/&gt;
 *     &lt;enumeration value="DeviceHashCodeNotCorrectlyDecrypted"/&gt;
 *     &lt;enumeration value="OperationFailed"/&gt;
 *     &lt;enumeration value="UserNotActivated"/&gt;
 *     &lt;enumeration value="UserStillActivate"/&gt;
 *     &lt;enumeration value="MobileUserLocked"/&gt;
 *     &lt;enumeration value="MobileDeviceRevoked"/&gt;
 *     &lt;enumeration value="PasswordChanged"/&gt;
 *     &lt;enumeration value="MobileOtpSendLimitExceeded"/&gt;
 *     &lt;enumeration value="EmailApproved"/&gt;
 *     &lt;enumeration value="NoEmailFound"/&gt;
 *     &lt;enumeration value="AsanSessionError"/&gt;
 *     &lt;enumeration value="OnlyAsanLoginAllowed"/&gt;
 *     &lt;enumeration value="OtpCheckLimitExceeded"/&gt;
 *     &lt;enumeration value="OtpSendLimitExceeded"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="EmailSendLimitExceeded"/&gt;
 *     &lt;enumeration value="PaymentInfoServiceItemNotSelected"/&gt;
 *     &lt;enumeration value="NoGiftInStock"/&gt;
 *     &lt;enumeration value="ReceiverWalletLimitExceeded"/&gt;
 *     &lt;enumeration value="WrongPromoCode"/&gt;
 *     &lt;enumeration value="AsanPaymentIsAlreadyPaid"/&gt;
 *     &lt;enumeration value="SmsSendLimitExceeded"/&gt;
 *     &lt;enumeration value="SmsSend"/&gt;
 *     &lt;enumeration value="UndecidedProtocol"/&gt;
 *     &lt;enumeration value="ProtocolCantDecided"/&gt;
 *     &lt;enumeration value="ProtocolNotFound"/&gt;
 *     &lt;enumeration value="MinTarifPay"/&gt;
 *     &lt;enumeration value="AlreadyHasPayment"/&gt;
 *     &lt;enumeration value="MasterpassError"/&gt;
 *     &lt;enumeration value="InactiveGiftCard"/&gt;
 *     &lt;enumeration value="Timeout"/&gt;
 *     &lt;enumeration value="WalletNotIdentified"/&gt;
 *     &lt;enumeration value="UnknownError"/&gt;
 *     &lt;enumeration value="SystemError"/&gt;
 *     &lt;enumeration value="RemoteServerError"/&gt;
 *     &lt;enumeration value="PossibleServiceError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultCodes")
@XmlEnum
public enum ResultCodes {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("InvalidNumber")
    INVALID_NUMBER("InvalidNumber"),
    @XmlEnumValue("InvalidParameters")
    INVALID_PARAMETERS("InvalidParameters"),
    @XmlEnumValue("InvalidTerminal")
    INVALID_TERMINAL("InvalidTerminal"),
    @XmlEnumValue("InvalidKey")
    INVALID_KEY("InvalidKey"),
    @XmlEnumValue("InvalidSignature")
    INVALID_SIGNATURE("InvalidSignature"),
    @XmlEnumValue("InvalidUsernameOrPassword")
    INVALID_USERNAME_OR_PASSWORD("InvalidUsernameOrPassword"),
    @XmlEnumValue("InvalidSession")
    INVALID_SESSION("InvalidSession"),
    @XmlEnumValue("NoPriv")
    NO_PRIV("NoPriv"),
    @XmlEnumValue("LoginFailed")
    LOGIN_FAILED("LoginFailed"),
    @XmlEnumValue("InvalidVerifyCode")
    INVALID_VERIFY_CODE("InvalidVerifyCode"),
    @XmlEnumValue("NotPayeed")
    NOT_PAYEED("NotPayeed"),
    @XmlEnumValue("PaymentDeclined")
    PAYMENT_DECLINED("PaymentDeclined"),
    @XmlEnumValue("Reversal")
    REVERSAL("Reversal"),
    @XmlEnumValue("TransactionIdAlreadyExists")
    TRANSACTION_ID_ALREADY_EXISTS("TransactionIdAlreadyExists"),
    @XmlEnumValue("CustomerNotFound")
    CUSTOMER_NOT_FOUND("CustomerNotFound"),
    @XmlEnumValue("InvalidAmount")
    INVALID_AMOUNT("InvalidAmount"),
    @XmlEnumValue("InvalidCurrency")
    INVALID_CURRENCY("InvalidCurrency"),
    @XmlEnumValue("TransactionIdNotFound")
    TRANSACTION_ID_NOT_FOUND("TransactionIdNotFound"),
    @XmlEnumValue("AccessDeniedForDbItem")
    ACCESS_DENIED_FOR_DB_ITEM("AccessDeniedForDbItem"),
    @XmlEnumValue("EmailStillInUse")
    EMAIL_STILL_IN_USE("EmailStillInUse"),
    @XmlEnumValue("PhoneStillInUse")
    PHONE_STILL_IN_USE("PhoneStillInUse"),
    @XmlEnumValue("UserTempBlocked")
    USER_TEMP_BLOCKED("UserTempBlocked"),
    @XmlEnumValue("DeviceHashCodeNotCorrectlyDecrypted")
    DEVICE_HASH_CODE_NOT_CORRECTLY_DECRYPTED("DeviceHashCodeNotCorrectlyDecrypted"),
    @XmlEnumValue("OperationFailed")
    OPERATION_FAILED("OperationFailed"),
    @XmlEnumValue("UserNotActivated")
    USER_NOT_ACTIVATED("UserNotActivated"),
    @XmlEnumValue("UserStillActivate")
    USER_STILL_ACTIVATE("UserStillActivate"),
    @XmlEnumValue("MobileUserLocked")
    MOBILE_USER_LOCKED("MobileUserLocked"),
    @XmlEnumValue("MobileDeviceRevoked")
    MOBILE_DEVICE_REVOKED("MobileDeviceRevoked"),
    @XmlEnumValue("PasswordChanged")
    PASSWORD_CHANGED("PasswordChanged"),
    @XmlEnumValue("MobileOtpSendLimitExceeded")
    MOBILE_OTP_SEND_LIMIT_EXCEEDED("MobileOtpSendLimitExceeded"),
    @XmlEnumValue("EmailApproved")
    EMAIL_APPROVED("EmailApproved"),
    @XmlEnumValue("NoEmailFound")
    NO_EMAIL_FOUND("NoEmailFound"),
    @XmlEnumValue("AsanSessionError")
    ASAN_SESSION_ERROR("AsanSessionError"),
    @XmlEnumValue("OnlyAsanLoginAllowed")
    ONLY_ASAN_LOGIN_ALLOWED("OnlyAsanLoginAllowed"),
    @XmlEnumValue("OtpCheckLimitExceeded")
    OTP_CHECK_LIMIT_EXCEEDED("OtpCheckLimitExceeded"),
    @XmlEnumValue("OtpSendLimitExceeded")
    OTP_SEND_LIMIT_EXCEEDED("OtpSendLimitExceeded"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("EmailSendLimitExceeded")
    EMAIL_SEND_LIMIT_EXCEEDED("EmailSendLimitExceeded"),
    @XmlEnumValue("PaymentInfoServiceItemNotSelected")
    PAYMENT_INFO_SERVICE_ITEM_NOT_SELECTED("PaymentInfoServiceItemNotSelected"),
    @XmlEnumValue("NoGiftInStock")
    NO_GIFT_IN_STOCK("NoGiftInStock"),
    @XmlEnumValue("ReceiverWalletLimitExceeded")
    RECEIVER_WALLET_LIMIT_EXCEEDED("ReceiverWalletLimitExceeded"),
    @XmlEnumValue("WrongPromoCode")
    WRONG_PROMO_CODE("WrongPromoCode"),
    @XmlEnumValue("AsanPaymentIsAlreadyPaid")
    ASAN_PAYMENT_IS_ALREADY_PAID("AsanPaymentIsAlreadyPaid"),
    @XmlEnumValue("SmsSendLimitExceeded")
    SMS_SEND_LIMIT_EXCEEDED("SmsSendLimitExceeded"),
    @XmlEnumValue("SmsSend")
    SMS_SEND("SmsSend"),
    @XmlEnumValue("UndecidedProtocol")
    UNDECIDED_PROTOCOL("UndecidedProtocol"),
    @XmlEnumValue("ProtocolCantDecided")
    PROTOCOL_CANT_DECIDED("ProtocolCantDecided"),
    @XmlEnumValue("ProtocolNotFound")
    PROTOCOL_NOT_FOUND("ProtocolNotFound"),
    @XmlEnumValue("MinTarifPay")
    MIN_TARIF_PAY("MinTarifPay"),
    @XmlEnumValue("AlreadyHasPayment")
    ALREADY_HAS_PAYMENT("AlreadyHasPayment"),
    @XmlEnumValue("MasterpassError")
    MASTERPASS_ERROR("MasterpassError"),
    @XmlEnumValue("InactiveGiftCard")
    INACTIVE_GIFT_CARD("InactiveGiftCard"),
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("WalletNotIdentified")
    WALLET_NOT_IDENTIFIED("WalletNotIdentified"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError"),
    @XmlEnumValue("RemoteServerError")
    REMOTE_SERVER_ERROR("RemoteServerError"),
    @XmlEnumValue("PossibleServiceError")
    POSSIBLE_SERVICE_ERROR("PossibleServiceError");
    private final String value;

    ResultCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultCodes fromValue(String v) {
        for (ResultCodes c: ResultCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
