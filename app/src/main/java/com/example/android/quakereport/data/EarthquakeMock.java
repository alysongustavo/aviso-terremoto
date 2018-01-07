package com.example.android.quakereport.data;

import android.app.Activity;

import com.example.android.quakereport.domain.Earthquake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cookiesoft on 07/01/2018.
 */

public class EarthquakeMock {

    private List<Earthquake> mListEarthQuake;

    public EarthquakeMock(){
        this.mListEarthQuake = getEarthquakeMockList();
    }

    public List<Earthquake> getList(){
        return this.mListEarthQuake;
    }

    public Earthquake get(int id){
        return this.mListEarthQuake.get(id);
    }

    private List<Earthquake> getEarthquakeMockList(){

        List<Earthquake> mMockList = new ArrayList<>();

        Earthquake tremorRioDeJaneiro = new Earthquake(Double.valueOf(5.2),"Rio de Janeiro", "21-12-2017");
        mMockList.add(tremorRioDeJaneiro);

        Earthquake tremorSaoPaulo = new Earthquake(Double.valueOf(5.7),"Sao Paulo", "27-12-2017");
        mMockList.add(tremorSaoPaulo);

        Earthquake tremorJoaoPessoa = new Earthquake(Double.valueOf(5.1),"Joao Pessoa", "20-12-2017");
        mMockList.add(tremorJoaoPessoa);

        Earthquake tremorRecife = new Earthquake(Double.valueOf(4.2),"Recife", "21-11-2017");
        mMockList.add(tremorRecife);

        Earthquake tremorNatal = new Earthquake(Double.valueOf(4.7),"Natal", "27-11-2017");
        mMockList.add(tremorNatal);

        Earthquake tremorMaceio = new Earthquake(Double.valueOf(5.1),"Maceio", "20-11-2017");
        mMockList.add(tremorMaceio);


        return mMockList;

    }
}
