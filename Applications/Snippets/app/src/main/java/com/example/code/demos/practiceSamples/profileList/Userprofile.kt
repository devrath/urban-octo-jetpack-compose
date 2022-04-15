package com.example.code.demos.practiceSamples.profileList

data class Userprofile(val id:Int,val name:String,val onLineStatus:String)

val userProfileList = arrayListOf<Userprofile>(
    Userprofile(id = 1,name = "Brijesh", onLineStatus = "Online"),
    Userprofile(id = 2,name = "Aakash", onLineStatus = "Offline"),
    Userprofile(id = 3,name = "Shruthi", onLineStatus = "Online"),
    Userprofile(id = 4,name = "Pavan", onLineStatus = "Online"),
    Userprofile(id = 5,name = "Kunal", onLineStatus = "Online"),
    Userprofile(id = 6,name = "Anil", onLineStatus = "Online"),
    Userprofile(id = 7,name = "Shalvi", onLineStatus = "Online"),
    Userprofile(id = 8,name = "Pulkit", onLineStatus = "Online")
)