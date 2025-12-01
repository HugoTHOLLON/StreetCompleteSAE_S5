package de.westnordost.streetcomplete.quests.aerialway

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AbstractOsmQuestForm
import de.westnordost.streetcomplete.quests.AnswerItem

class BoatLockSelfServiceForm : AbstractOsmQuestForm<BoatLockSelfServiceAnswer>() {
    override val buttonPanelAnswers = listOf(
        AnswerItem(R.string.quest_generic_hasFeature_no) { applyAnswer(BoatLockSelfServiceAnswer.NO) },
        AnswerItem(R.string.quest_wheelchairAccess_limited) { applyAnswer(BoatLockSelfServiceAnswer.PARTIALLY) },
        AnswerItem(R.string.quest_hasFeature_only) { applyAnswer(BoatLockSelfServiceAnswer.ONLY) },
        AnswerItem(R.string.quest_generic_hasFeature_yes) { applyAnswer(BoatLockSelfServiceAnswer.YES) }
    )
}
