package com.tomuchcoffee.whatsapp.model

data class UsersData(
    var userName: String = "",
    var chatTimeStatus: String = "",
    var chatTime: String = "",
    var chatTimeCall: String = "",
    var userPhoto: Int = 0,
    var id: Int = 0,
    var userId: Int = 0,
    var unSeenMsg: Int = 0,
    var message: String = "",
    var time: String = "",
    var senderId: Int = 0

//    var chatsDetail: ArrayList<ChatDetails>
)

//data class ChatDetails(
//    var message: String = "",
//    var time: String = "",
//    var senderId: Int = 0
//)