// Student_Id: 301385235

package com.example.juwon.ajana.data

import java.util.UUID

data class Contact(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val phoneNumber: String,
    val email: String,
    val contactTypes: Set<ContactType>
)

enum class ContactType {
    FRIEND, FAMILY, WORK
}
