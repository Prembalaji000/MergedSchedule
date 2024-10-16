package com.example.mergedschedule

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun SessionTopicPreview(){
    SessionTopic()
}

@Composable
fun SessionTopic(){
    Card (
        modifier = Modifier,
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.bg2)),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "L1 - Session Topic (05)",
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.topic),
                modifier = Modifier.padding(start = 10.dp, 6.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24),
                contentDescription = "",
                colorFilter = ColorFilter.tint(colorResource(id = R.color.bg2)),
                modifier = Modifier.padding(end = 16.dp, top = 22.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 10.dp, bottom = 10.dp),
        ){
            Text(
                text = "PO3 Introduction...",
                fontSize = 12.sp,
                color = colorResource(id = R.color.bg2),
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                colorFilter = ColorFilter.tint(colorResource(id = R.color.bg2)),
                modifier = Modifier
                    .padding(top = 2.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "MG -G1 (50 Stu...)",
                fontSize = 12.sp,
                color = colorResource(id = R.color.bg2),
                fontWeight = FontWeight.Normal,)
            Spacer(modifier = Modifier.width(2.dp))
            Image(
                painter = painterResource(id = R.drawable.dot),
                contentDescription = "",
                colorFilter = ColorFilter.tint(colorResource(id = R.color.bg2)),
                modifier = Modifier
                    .padding(top = 2.dp))
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "Infrastructure Name...",
                fontSize = 12.sp,
                color = colorResource(id = R.color.bg2),
                fontWeight = FontWeight.Normal,
            )
            Spacer(modifier = Modifier.width(36.dp))
        }
    }
}

@Preview
@Composable
fun DropdownPreview(){
    Dropdown()
}

@Composable
fun Dropdown(){
    Card (
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.bg2)),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ){
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Mohammed Salim",
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.bg2),
                    modifier = Modifier.padding(start = 10.dp, 6.dp)
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "20201234",
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.bg2),
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
                )
            }
            
        }
    }
}