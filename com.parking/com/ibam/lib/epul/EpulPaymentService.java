
package com.ibam.lib.epul;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EpulPaymentService", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EpulPaymentService {


    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.ListServicesResult
     */
    @WebMethod(operationName = "ListServices", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/ListServices")
    @WebResult(name = "ListServicesResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "ListServices", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListServices")
    @ResponseWrapper(localName = "ListServicesResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListServicesResponse")
    public ListServicesResult listServices(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPaymentStandardRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.ServiceInfoResult
     */
    @WebMethod(operationName = "GetPaymentServiceInfo", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/GetPaymentServiceInfo")
    @WebResult(name = "GetPaymentServiceInfoResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "GetPaymentServiceInfo", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.GetPaymentServiceInfo")
    @ResponseWrapper(localName = "GetPaymentServiceInfoResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.GetPaymentServiceInfoResponse")
    public ServiceInfoResult getPaymentServiceInfo(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPaymentInfoRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.PayResult
     */
    @WebMethod(operationName = "Pay", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/Pay")
    @WebResult(name = "PayResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "Pay", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.Pay")
    @ResponseWrapper(localName = "PayResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.PayResponse")
    public PayResult pay(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPayRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.EpulSmartCardPayResult
     */
    @WebMethod(operationName = "PaySmartCard", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/PaySmartCard")
    @WebResult(name = "PaySmartCardResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "PaySmartCard", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.PaySmartCard")
    @ResponseWrapper(localName = "PaySmartCardResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.PaySmartCardResponse")
    public EpulSmartCardPayResult paySmartCard(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPayRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.EpulCheckTransactionResult
     */
    @WebMethod(operationName = "CheckTransaction", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/CheckTransaction")
    @WebResult(name = "CheckTransactionResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "CheckTransaction", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.CheckTransaction")
    @ResponseWrapper(localName = "CheckTransactionResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.CheckTransactionResponse")
    public EpulCheckTransactionResult checkTransaction(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulByNameRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.EpulPaymentHistoryResult
     */
    @WebMethod(operationName = "ListHistory", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/ListHistory")
    @WebResult(name = "ListHistoryResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "ListHistory", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListHistory")
    @ResponseWrapper(localName = "ListHistoryResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListHistoryResponse")
    public EpulPaymentHistoryResult listHistory(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulByIdRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.ListPlainCategoriesResult
     */
    @WebMethod(operationName = "ListCategories", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/ListCategories")
    @WebResult(name = "ListCategoriesResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "ListCategories", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListCategories")
    @ResponseWrapper(localName = "ListCategoriesResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListCategoriesResponse")
    public ListPlainCategoriesResult listCategories(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPaymentStandardRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.ListServicesResult
     */
    @WebMethod(operationName = "ListServicesByCategory", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/ListServicesByCategory")
    @WebResult(name = "ListServicesByCategoryResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "ListServicesByCategory", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListServicesByCategory")
    @ResponseWrapper(localName = "ListServicesByCategoryResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.ListServicesByCategoryResponse")
    public ListServicesResult listServicesByCategory(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulByIdRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.ibam.lib.epul.FeeResult
     */
    @WebMethod(operationName = "Fee", action = "http://quetzalcoatlus/EpulPaymentService/EpulPaymentService/Fee")
    @WebResult(name = "FeeResult", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
    @RequestWrapper(localName = "Fee", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.Fee")
    @ResponseWrapper(localName = "FeeResponse", targetNamespace = "http://quetzalcoatlus/EpulPaymentService", className = "com.ibam.lib.epul.FeeResponse")
    public FeeResult fee(
        @WebParam(name = "request", targetNamespace = "http://quetzalcoatlus/EpulPaymentService")
        EpulPayRequest request);

}
