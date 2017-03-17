package com.song.filetransfer.model;


import com.song.filetransfer.base.BaseUser;

import java.util.HashMap;
import java.util.Map;

public class UserModel extends BaseUser{

    private Map<String,RecordModel> mRecordList;
    private Map<String,PeerModel> mPeerList;

    public UserModel(){
        this(null,null,null);
    }
    public UserModel(String name){
        this(name,null,null);
    }
    public UserModel(String name,String mac){
        this(name,mac,null);
    }
    public UserModel(String name,String mac, String ip ){
        super(name,mac,ip);
        mRecordList = new HashMap<>();
        mPeerList = new HashMap<>();
    }

    public void addPeer(PeerModel peerModel){
        mPeerList.put(peerModel.getMac(),peerModel);
    }

    public void removePeer(PeerModel peerModel){
        mPeerList.remove(peerModel.getMac());
    }

    public void addRecord(RecordModel recordModel){
        mRecordList.put(recordModel.getFilePath(),recordModel);
    }

    public void removeRecord(RecordModel recordModel){
        mRecordList.remove(recordModel.getFilePath());
    }
}
