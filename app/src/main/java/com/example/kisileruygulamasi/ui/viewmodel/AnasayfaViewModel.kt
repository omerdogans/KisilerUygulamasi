package com.example.kisileruygulamasi.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.data.repo.KisilerDaoRepository

class AnasayfaViewModel: ViewModel() {

    val krepo = KisilerDaoRepository()
    var kisilerListesi: MutableLiveData<List<Kisiler>>

    init {
        kisileriYukle()//ilk çalışmada veri getirmez.
        kisilerListesi = krepo.kisilerGetir()
    }

    fun ara(aramaKelimesi:String){
        krepo.ara(aramaKelimesi)
        //Log.e("Kişi Ara", aramaKelimesi)
    }
    fun sil(kisi_id:Int){
        krepo.sil(kisi_id)
        //Log.e("Kişi Sİl", kisi_id.toString())

    }

    fun kisileriYukle(){
        krepo.kisileriYukle()
    }
}