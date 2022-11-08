package com.example.gd10_kelas_10843

import com.google.gson.annotations.SerializedName

class ResponseDataMahasiswa (
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>)
