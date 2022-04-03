package com.example.code.demos.practiceSamples.profileList

data class Userprofile(val name:String,val onLineStatus:String)

val userProfileList = arrayListOf<Userprofile>(
    Userprofile(name = "Brijesh", onLineStatus = "Online"),
    Userprofile(name = "Aakash", onLineStatus = "Offline"),
    Userprofile(name = "Shruthi", onLineStatus = "Online"),
    Userprofile(name = "Pavan", onLineStatus = "Online"),
    Userprofile(name = "Kunal", onLineStatus = "Online"),
    Userprofile(name = "Anil", onLineStatus = "Online"),
    Userprofile(name = "Shalvi", onLineStatus = "Online"),
    Userprofile(name = "Pulkit", onLineStatus = "Online")
)