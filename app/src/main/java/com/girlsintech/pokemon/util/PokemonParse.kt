package com.girlsintech.pokemon.util

import androidx.compose.ui.graphics.Color
import com.girlsintech.pokemon.data.remote.responses.PokemonInfo
import com.girlsintech.pokemon.data.remote.responses.Stat
import com.girlsintech.pokemon.data.remote.responses.Type
import com.girlsintech.pokemon.ui.theme.*
import java.util.*


fun parseTypeToColor(pokemon: PokemonInfo, type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> Color.Green
        "fire" -> Color.Red
        "water" -> Color.Cyan
        "electric" -> Color.Yellow
        "grass" -> Color.Green
        "ice" -> Color.Blue
        "fighting" -> Color.Red
        "poison" -> Color.DarkGray
        "ground" -> Color.LightGray
        "flying" -> Color.Blue
        "psychic" -> Color.Green
        "bug" -> Color.Magenta
        "rock" -> Color.DarkGray
        "ghost" -> Color.Yellow
        "dragon" -> Color.Red
        "dark" -> Color.DarkGray
        "steel" -> Color.Red
        "fairy" -> Color.Magenta
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> hpColor.copy(0.8f)
        "attack" -> attackColor.copy(0.8f)
        "defense" -> defenseColor.copy(0.8f)
        "special-attack" -> specialAttackColor.copy(0.8f)
        "special-defense" -> specialDefenseColor.copy(0.8f)
        "speed" -> speedColor.copy(0.8f)
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> "HP"
        "attack" -> "Attack"
        "defense" -> "Defense"
        "special-attack" -> "Special Attack"
        "special-defense" -> "Special Defense"
        "speed" -> "Speed"
        else -> ""
    }
}