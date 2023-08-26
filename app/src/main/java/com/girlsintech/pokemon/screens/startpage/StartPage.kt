package com.girlsintech.pokemon.screens.startpage

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.girlsintech.pokemon.R
import com.girlsintech.pokemon.screens.startpage.Start

@Composable
fun MainView(
    onClickDiscover: () -> Unit,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        val configuration = LocalConfiguration.current

        when (configuration.orientation) {
            Configuration.ORIENTATION_PORTRAIT -> {
                Row {
                    Icon(
                        Icons.TwoTone.ArrowBack,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(top = 15.dp, start = 15.dp)
                    )
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = R.drawable.sfondo),
                        contentDescription = "background",
                        contentScale = ContentScale.FillBounds
                    )
                }

                ConstraintLayout {
                    val (images, button, icon) = createRefs()

                    Column (modifier = Modifier
                        .constrainAs(images){
                            top.linkTo(parent.top, 10.dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }){
                        Image(painter = painterResource(id = R.drawable.pokemon_title),
                            contentDescription = "image",
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(40.dp))
                        Image(painter = painterResource(id = R.drawable.pokemon),
                            contentDescription = "image",
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }

                    Column (modifier = Modifier
                        .constrainAs(button) {
                            top.linkTo(images.bottom, 30.dp)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                    )  {
                        Start(onClickDiscover, onClick)
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 25.dp, bottom = 25.dp)
                            .constrainAs(icon) {
                                bottom.linkTo(parent.bottom)
                                end.linkTo(parent.end)
                            },
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Bottom
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pokeball),
                            modifier = Modifier.size(60.dp),
                            contentDescription = null
                        )
                    }
                }
            }
            else -> {
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterResource(id = R.drawable.sfondoh),
                    contentDescription = "background",
                    contentScale = ContentScale.FillBounds
                )

                ConstraintLayout {
                    val (images, button, icon) = createRefs()

                    Column (modifier = Modifier
                        .constrainAs(images){
                            top.linkTo(parent.top)
                            start.linkTo(parent.start, 80.dp)
                            bottom.linkTo(parent.bottom)
                        }
                    ){
                        Image(painter = painterResource(id = R.drawable.pokemon_title),
                            contentDescription = "image"
                        )
                        Spacer(modifier = Modifier.height(0.dp))
                        Image(painter = painterResource(id = R.drawable.pokemon),
                            contentDescription = "image"
                        )
                    }

                    Column (modifier = Modifier
                        .constrainAs(button) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start, 165.dp)
                            bottom.linkTo(parent.bottom)
                        }
                    )  {
                        Start(onClickDiscover, onClick)
                    }

                    Column (modifier = Modifier
                        .constrainAs(icon) {
                            end.linkTo(parent.end, 30.dp)
                            bottom.linkTo(parent.bottom, 20.dp)
                        }
                    )  {
                        Image(
                            painter = painterResource(id = R.drawable.pokeball),
                            modifier = Modifier.size(60.dp),
                            contentDescription = null
                        )
                    }

                }
            }
        }
    }
}




