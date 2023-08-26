package com.girlsintech.pokemon.screens.startpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.girlsintech.pokemon.R
import com.girlsintech.pokemon.screens.fontPokemon
import com.girlsintech.pokemon.ui.theme.BluePokemon
import com.girlsintech.pokemon.ui.theme.Yellow

@Composable
fun Start(
    onClickDiscover: () -> Unit,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,  //non ci sono spazi a sinistra e a destra ma solo tra gli oggetti
            verticalAlignment = Alignment.CenterVertically  //gli oggetti sono inseriti tutti nella parte alta dell'interfaccia
        ) {
            Text(
                text = stringResource(id = R.string.start),
                modifier = Modifier
                    .padding(4.dp)
                    .weight(1f)
                    .padding(8.dp),
                color = BluePokemon,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = fontPokemon()
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column {

            Button(
                modifier = Modifier
                    .wrapContentWidth()
                    .width(250.dp),
                onClick = onClick,
                shape = RoundedCornerShape(30),
                colors = ButtonDefaults.buttonColors(BluePokemon)
            ) {
                Row {
                    Text(
                        text = "Pokédex",
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f)
                            .padding(8.dp),
                        color = Color.White,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        fontFamily = fontPokemon()
                    )

                    Image(
                        painter = painterResource(id = R.drawable.grey_pokeball),
                        contentDescription = "pokeball",
                        modifier = Modifier
                            .requiredSize(45.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                modifier = Modifier
                    .wrapContentWidth()
                    .width(250.dp),
                onClick = onClickDiscover,
                shape = RoundedCornerShape(30),
                colors = ButtonDefaults.buttonColors(Yellow)
            ) {
                Row {
                    Text(
                        text = stringResource(id = R.string.discover),
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f)
                            .padding(8.dp),
                        color = Color.White,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        fontFamily = fontPokemon()
                    )

                    Image(
                        painter = painterResource(id = R.drawable.grey_pokeball),
                        contentDescription = "pokeball",
                        modifier = Modifier
                            .requiredSize(45.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}