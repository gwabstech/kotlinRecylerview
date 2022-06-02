package com.gwabs.kotlinrecylerview.data

import com.gwabs.kotlinrecylerview.R
import com.gwabs.kotlinrecylerview.model.AffirmationModel

class Datasource {
    fun loadAffirmations(): List<AffirmationModel>{
        return listOf<AffirmationModel>(
            AffirmationModel(R.string.affirmation1),
            AffirmationModel(R.string.affirmation2),
            AffirmationModel(R.string.affirmation3),
            AffirmationModel(R.string.affirmation4),
            AffirmationModel(R.string.affirmation5),
            AffirmationModel(R.string.affirmation6),
            AffirmationModel(R.string.affirmation7),
            AffirmationModel(R.string.affirmation8),
            AffirmationModel(R.string.affirmation9),
            AffirmationModel(R.string.affirmation10)


        )

    }
}