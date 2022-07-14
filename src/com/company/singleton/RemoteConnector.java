package com.company.singleton;

public class RemoteConnector {
    private static RemoteConnector remoteConnector;
    private String address;
    private RemoteConnector(String address)
    {this.address=address;}
    public static synchronized void connect(String address)
    {
        if (remoteConnector == null)
        {remoteConnector = new RemoteConnector(address);
        }
    }
}
