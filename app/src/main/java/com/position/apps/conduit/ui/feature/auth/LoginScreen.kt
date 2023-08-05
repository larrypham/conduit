package com.position.apps.conduit.ui.feature.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.position.apps.conduit.R
import com.position.apps.conduit.util.HorizontalSpacer
import com.position.apps.conduit.util.VerticalSpacer

@Preview(device = Devices.PIXEL_4_XL, showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (main, notice) = createRefs()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .constrainAs(main) {
                    top.linkTo(parent.top, 100.dp)
                },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier
                    .wrapContentWidth()
                    .height(32.dp),
                imageVector = ImageVector.vectorResource(R.drawable.logo_medium),
                contentDescription = null
            )
            Text(
                text = stringResource(id = R.string.label_join_medium),
                fontSize = 32.sp
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedIconButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.label_signup_with_google))
                }
                OutlinedIconButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.label_signup_with_facebook))
                }
                OutlinedIconButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.label_signup_with_email))
                }
                OutlinedIconButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.label_signup_with_apple))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = stringResource(id = R.string.label_already_have_account))
                    VerticalSpacer(width = 8.dp)
                    Text(text = stringResource(id = R.string.label_signin))
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .constrainAs(notice) {
                    bottom.linkTo(parent.bottom, 56.dp)
                },
            contentAlignment = Alignment.Center,
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(0.8f),
                text = stringResource(id = R.string.label_notice_agreement)
            )
        }
    }

}