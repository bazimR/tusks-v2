@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)

package com.example.tusks.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tusks.ui.theme.TusksTheme

@Composable
fun TusksApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    "Tusks",
                    style = MaterialTheme.typography.headlineSmall
                )
            })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                stickyHeader {
                    Surface(
                        color = MaterialTheme.colorScheme.background,
                        shadowElevation = 4.dp // Optional
                    ) {
                        // Make the whole header (including divider) a fixed height if you want:
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(56.dp) // Height of toolbar/header row
                                    .padding(horizontal = 16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    "Today",
                                    style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.SemiBold)
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                IconButton(onClick = {}) {
                                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "expand")
                                }
                            }
                            // Divider is included as part of the header
                            HorizontalDivider()
                        }
                    }
                }

                items(20) {
                    Text("hello world $it", modifier = Modifier.padding(vertical = 16.dp))
                }
            }
        }
    }
}

@Preview
@Composable
private fun TusksAppPreview() {
    TusksTheme {
        TusksApp()
    }
}
