package com.company.singleton;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class RemoteConnector implements Externalizable {
    private static RemoteConnector remoteConnector;
    private boolean connected;
    private String address;

    private RemoteConnector()
    {}
    public synchronized void connect(String address)
    {
        if (connected)
        {return;
        }
        connected = true;
        this.connect(this.address=address);
    }
    public static synchronized RemoteConnector getInstance()
    { if (remoteConnector == null)
    {remoteConnector = new RemoteConnector();
    }
    return remoteConnector;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
