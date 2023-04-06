package com.example.kisileruygulamasi.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kisileruygulamasi.data.entity.Kisiler

class KisilerDaoRepository {
    var kisilerListesi: MutableLiveData<List<Kisiler>>

    init {
        kisilerListesi = MutableLiveData()
    }

    fun kisilerGetir(): MutableLiveData<List<Kisiler>> {
        return kisilerListesi
    }

    fun kaydet(kisi_ad: String, kisi_tel: String) {
        Log.e("Kişi Kaydet", "$kisi_ad - $kisi_tel")
    }

    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        Log.e("Kişi Güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    fun ara(aramaKelimesi: String) {
        Log.e("Kişi Ara", aramaKelimesi)
    }

    fun sil(kisi_id: Int) {
        Log.e("Kişi Sİl", kisi_id.toString())

    }

    fun kisileriYukle() {

        val liste = ArrayList<Kisiler>()
        val k1 = Kisiler(1, "Ahmet", "1111")
        val k2 = Kisiler(2, "Zeynep", "2222")
        val k3 = Kisiler(3, "Beyza", "3333")
        liste.add(k1)
        liste.add(k2)
        liste.add(k3)
        kisilerListesi.value = liste
    }
}