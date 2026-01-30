package de.westnordost.streetcomplete.quests.pipeline_location

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AbstractOsmQuestForm
import de.westnordost.streetcomplete.quests.AnswerItem

class PipelineLocationForm : AbstractOsmQuestForm<PipelineLocationAnswer>() {
    override val buttonPanelAnswers = listOf(
        AnswerItem(R.string.underground) { applyAnswer(PipelineLocationAnswer.UNDERGROUND) },
        AnswerItem(R.string.overground) { applyAnswer(PipelineLocationAnswer.OVERGROUND) },
        AnswerItem(R.string.overhead) { applyAnswer(PipelineLocationAnswer.OVERHEAD) },
        AnswerItem(R.string.underwater) { applyAnswer(PipelineLocationAnswer.UNDERWATER) }
    )
}
