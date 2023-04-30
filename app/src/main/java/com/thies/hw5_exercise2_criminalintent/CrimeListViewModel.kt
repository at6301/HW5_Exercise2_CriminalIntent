package com.thies.hw5_exercise2_criminalintent

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel: ViewModel() {

    /*val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime(
                id = UUID.randomUUID(),
                title = "Crime #$i",
                date = Date(),
                isSolved = i % 2 == 0,
                requiresPolice = RequiresPolice.FALSE
            )
            crimes += crime
        }
    }*/

    // Creating an array list to show different views based off of different data types
    val crimes = arrayListOf<Crime>(
        Crime(
        id = UUID.randomUUID(),
        title = "Crime #1",
        date = Date(),
        isSolved = false,
        requiresPolice = RequiresPolice.TRUE
        ),
        Crime(
            id = UUID.randomUUID(),
            title = "Crime #2",
            date = Date(),
            isSolved = false,
            requiresPolice = RequiresPolice.FALSE
        ),
        Crime(
            id = UUID.randomUUID(),
            title = "Crime #3",
            date = Date(),
            isSolved = true,
            requiresPolice = RequiresPolice.FALSE
        ),
        Crime(
            id = UUID.randomUUID(),
            title = "Crime #4",
            date = Date(),
            isSolved = false,
            requiresPolice = RequiresPolice.FALSE
        ),
        Crime(
            id = UUID.randomUUID(),
            title = "Crime #5",
            date = Date(),
            isSolved = false,
            requiresPolice = RequiresPolice.TRUE
        )
    )


}