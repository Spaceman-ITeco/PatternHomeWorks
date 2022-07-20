package com.company.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Volume implements Storage{
    protected List<Storage> volume=new ArrayList();
    public Volume (Storage... volume)
    {this.volume.addAll(Arrays.asList(volume));}

    @Override
    public int getVolume() {
        int commonVolume=0;
        for(Storage storage: volume)
        {commonVolume = commonVolume + storage.getVolume();}
        return commonVolume;
    }
}
