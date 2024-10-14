package com.example.mergedschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mergedschedule.ui.theme.MergedScheduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MergedScheduleTheme {
                MergedSchedule()
            }
        }
    }
}

@Preview
@Composable
fun MergedSchedulePreview(){
    MergedSchedule()
}

@Composable
fun MergedSchedule(){
    Card (
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.bg)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, top = 14.dp, end = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Merged Schedule (02)",
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_close_24),
                contentDescription = "",
                alignment = Alignment.BottomEnd,
                modifier = Modifier.clickable {

                }
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Column (
            modifier = Modifier
                .padding(12.dp)
        ){
            FirstSchedule()
            Spacer(modifier = Modifier.height(12.dp))
            SecondSchedule()
        }
    }
}


@Preview
@Composable
fun FirstSchedulePreview(){
    FirstSchedule()
}

@Composable
fun FirstSchedule(){
    var selectedItem by remember { mutableIntStateOf(0) }
    Card (
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.bg2)
        )
    ){
        Text(text = "L1 - Session Topic",
            fontWeight = FontWeight.SemiBold,
            color = Color.White,
            modifier = Modifier.padding(start = 10.dp, 8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Text(
                text = "PO3 Introduction...",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 3.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "MG -G1 (50 Stu...)",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(2.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 3.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "Infrastructure Name...",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
        }
        Spacer(modifier = Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.bg3))
        ){
            Tab(items = listOf("Dr.Pravee...", "Dr.Moha...", "Dr.Moha..."),
                onItemSelected = { selectedItem = it },
                selectedItem = selectedItem
            )
        }
    }
}

@Preview
@Composable
fun SecondSchedulePreview(){
    SecondSchedule()
}

@Composable
fun SecondSchedule(){
    var selectedItem by remember { mutableIntStateOf(0) }
    Card (
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.bg2)
        )
    ){
        Text(text = "L2 - Session Topic",
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(start = 10.dp, 8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Text(
                text = "PO3 Introduction...",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 3.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "MG -G1 (50 Stu...)",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(2.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 3.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "Infrastructure Name...",
                fontSize = 12.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,)
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .background(colorResource(id = R.color.button))
                .border(BorderStroke(0.2.dp, Color.Red))
                .clickable { },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Different Infrastructure",
                fontWeight = FontWeight.SemiBold,
                color = Color.Red,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(6.dp)
                )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.bg3))
        ){
            Tab(
                items = listOf("Dr.Pravee...", "Dr.Moha...", "Dr.Moha..."),
                onItemSelected = { selectedItem = it },
                selectedItem = selectedItem
            )
        }
    }
}

@Composable
fun Tab(
    items: List<String>,
    onItemSelected: (Int) -> Unit,
    selectedItem: Int,
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(start = 8.dp, end = 30.dp)
    ) {
        itemsIndexed(items) { index, item ->
            TabItem(
                value = item,
                onClick = { onItemSelected(index) },
                isSelected = selectedItem == index
            )
        }
    }
}

@Composable
fun TabItem(
    value: String,
    onClick: () -> Unit,
    isSelected: Boolean,
) {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(15.dp))
            .background(colorResource(id = R.color.tabColor))
            .clickable(enabled = !isSelected, onClick = onClick)
            .padding(horizontal = 8.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = value,
            fontWeight = if (isSelected) FontWeight.Medium else FontWeight.Normal,
            color = colorResource(id = R.color.bg2),
            fontSize = 12.sp,
            modifier = Modifier.padding(6.dp)
        )
    }
}