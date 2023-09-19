package org.launchcode;

import java.util.HashMap;

public abstract class BaseDisc {
    private String discData;
    private HashMap<String,String> discInfo;
    private boolean isInserted;
    private final int storageCapacityInMB;
    private final int storageSpeedInRPM;


    public BaseDisc(int storageCapacityInMB,int storageSpeedInRPM) {
        this.discData = "";
        this.discInfo=new HashMap<>();
        this.isInserted=false;

        this.storageCapacityInMB=storageCapacityInMB;
        this.storageSpeedInRPM=storageSpeedInRPM;

        this.discInfo.put("Stroage Capacity",String.valueOf(storageCapacityInMB));
        this.discInfo.put("Storage Speed",String.valueOf(storageSpeedInRPM));

    }

    public BaseDisc(int storageCapacityInMB,int storageSpeedInRPM,String title) {
        this(storageCapacityInMB,storageSpeedInRPM);
        this.discInfo.put("Title",title);


    }

    public boolean isInserted() {
        return isInserted;
    }

    public int getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    public int getStorageSpeedInRPM() {
        return storageSpeedInRPM;
    }

    protected void writeData(String discData)
    {
        this.discData+=discData;
    }
    public String readData()
    {
        return this.discData;
    }
    public HashMap<String,String> getInfo()
    {
        return this.discInfo;

    }
    public void insert()
    {
        this.isInserted=true;

    }
}
