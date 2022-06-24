package com.tomuchcoffee.whatsapp.model

import com.tomuchcoffee.whatsapp.R

object DataDummy {

    private val chatUserNames = arrayOf(
        "Aldo",
        "Regan",
        "Ponta"
    )

    private val chatTimeStatus = arrayOf(
        "Kemarin 12.00",
        "Baru Saja",
        "Hari Ini 01.00"
    )

    private val chatTime = arrayOf(
        "Baru Saja",
        "Hari Ini 15.00",
        "Kemarin 16.23"
    )

    private val chatTimeCall = arrayOf(
        "Baru Saja",
        "Kemarin 16.56",
        "Hari Ini 12.20"
    )

    private val chatUserPhoto = arrayOf(
        R.drawable.img,
        R.drawable.img_1,
        R.drawable.img_2
    )

    private val idUserChat = arrayOf(
        1,
        2,
        3
    )

    private val userID = arrayOf(
        1,
        2,
        3
    )

    private val unSeeChat = arrayOf(
        0,
        3,
        1
    )

    private val messages = arrayOf(
        "Gimana kabar ?",
        "udah makan kah..",
        "tenaki enjoy"
    )

    private val timechat = arrayOf(
        "12.40",
        "15.33",
        "20.21"
    )

    private val senderid = arrayOf(
        1,
        2,
        3
    )

    val usersData: ArrayList<UsersData>
        get() {
            val listData = arrayListOf<UsersData>()
            for (i in chatUserNames.indices) {
                val data = UsersData()
                data.userName = chatUserNames[i]
                data.chatTimeStatus = chatTimeStatus[i]
                data.chatTime = chatTime[i]
                data.chatTimeCall = chatTimeCall[i]
                data.userPhoto = chatUserPhoto[i]
                data.id = idUserChat[i]
                data.userId = userID[i]
                data.unSeenMsg = unSeeChat[i]
                data.message = messages[i]
                data.time = timechat[i]
                data.senderId = senderid[i]
                listData.add(data)
            }
            return listData
        }


}