// Student_Id: 301385235

package com.example.juwon.ajana.viewmodel

import androidx.lifecycle.ViewModel
import com.example.juwon.ajana.data.Contact
import com.example.juwon.ajana.data.ContactType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class ContactViewModel : ViewModel() {
    private val _contacts = MutableStateFlow<List<Contact>>(emptyList())
    val contacts: StateFlow<List<Contact>> = _contacts.asStateFlow()

    private val _name = MutableStateFlow("")
    val name = _name.asStateFlow()

    private val _phoneNumber = MutableStateFlow("")
    val phoneNumber = _phoneNumber.asStateFlow()

    private val _email = MutableStateFlow("")
    val email = _email.asStateFlow()

    private val _selectedTypes = MutableStateFlow<Set<ContactType>>(emptySet())
    val selectedTypes = _selectedTypes.asStateFlow()

    fun updateName(name: String) {
        _name.value = name
    }

    fun updatePhoneNumber(phone: String) {
        _phoneNumber.value = phone
    }

    fun updateEmail(email: String) {
        _email.value = email
    }

    fun toggleContactType(type: ContactType) {
        _selectedTypes.value = if (_selectedTypes.value.contains(type)) {
            _selectedTypes.value - type
        } else {
            _selectedTypes.value + type
        }
    }

    fun addContact(): Boolean {
        if (_name.value.isBlank() || _phoneNumber.value.isBlank() || _email.value.isBlank()) {
            return false
        }

        val newContact = Contact(
            name = _name.value,
            phoneNumber = _phoneNumber.value,
            email = _email.value,
            contactTypes = _selectedTypes.value
        )

        _contacts.value += newContact
        clearForm()
        return true
    }

    private fun clearForm() {
        _name.value = ""
        _phoneNumber.value = ""
        _email.value = ""
        _selectedTypes.value = emptySet()
    }
}