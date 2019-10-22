package com.srikeerthna;

public class SriKeerthnaProxy implements com.srikeerthna.SriKeerthna {
  private String _endpoint = null;
  private com.srikeerthna.SriKeerthna sriKeerthna = null;
  
  public SriKeerthnaProxy() {
    _initSriKeerthnaProxy();
  }
  
  public SriKeerthnaProxy(String endpoint) {
    _endpoint = endpoint;
    _initSriKeerthnaProxy();
  }
  
  private void _initSriKeerthnaProxy() {
    try {
      sriKeerthna = (new com.srikeerthna.SriKeerthnaServiceLocator()).getSriKeerthna();
      if (sriKeerthna != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sriKeerthna)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sriKeerthna)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sriKeerthna != null)
      ((javax.xml.rpc.Stub)sriKeerthna)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.srikeerthna.SriKeerthna getSriKeerthna() {
    if (sriKeerthna == null)
      _initSriKeerthnaProxy();
    return sriKeerthna;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (sriKeerthna == null)
      _initSriKeerthnaProxy();
    return sriKeerthna.getName();
  }
  
  
}