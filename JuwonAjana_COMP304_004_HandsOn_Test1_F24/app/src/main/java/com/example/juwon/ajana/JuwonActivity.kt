// Student_Id: 301385235

package com.example.juwon.ajana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.juwon.ajana.ui.theme.JuwonAjana_COMP304_004_HandsOn_Test1_F24Theme
import com.example.juwon.ajana.view.AjanaActivity

class JuwonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JuwonAjana_COMP304_004_HandsOn_Test1_F24Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyContactsApp()
                }
            }
        }
    }
}

@Composable
fun MyContactsApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(onNavigateToContacts = {
                navController.navigate("contacts")
            })
        }
        composable("contacts") {
            AjanaActivity()
        }
    }
}

@Composable
fun MainScreen(onNavigateToContacts: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.contacts_logo),
            contentDescription = "Contacts Logo",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        FilledTonalButton(
            onClick = onNavigateToContacts,
            modifier = Modifier.size(width = 220.dp, height = 50.dp)
        ) {
            Text("Manage Contacts")
        }
    }
}


