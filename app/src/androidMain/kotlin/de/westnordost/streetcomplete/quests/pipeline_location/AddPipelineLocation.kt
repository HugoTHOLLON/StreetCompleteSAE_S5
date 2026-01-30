package de.westnordost.streetcomplete.quests.pipeline_location

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.geometry.ElementGeometry
import de.westnordost.streetcomplete.data.osm.osmquests.OsmFilterQuestType
import de.westnordost.streetcomplete.data.quest.AndroidQuest
import de.westnordost.streetcomplete.data.user.achievements.EditTypeAchievement.OUTDOORS
import de.westnordost.streetcomplete.osm.Tags
import de.westnordost.streetcomplete.quests.pipeline_location.PipelineLocationAnswer.UNDERGROUND
import de.westnordost.streetcomplete.quests.pipeline_location.PipelineLocationAnswer.OVERGROUND
import de.westnordost.streetcomplete.quests.pipeline_location.PipelineLocationAnswer.OVERHEAD
import de.westnordost.streetcomplete.quests.pipeline_location.PipelineLocationAnswer.UNDERWATER

class AddPipelineLocation : OsmFilterQuestType<PipelineLocationAnswer>(), AndroidQuest {

    override val elementFilter = """ ways with man_made=pipeline and !location """

    override val changesetComment = "Specify where is located the pipeline"
    override val wikiLink = "Tag:man_made=pipeline"
    override val icon = R.drawable.pipeline_location
    override val achievements = listOf(OUTDOORS)

    override fun getTitle(tags: Map<String, String>) = R.string.quest_pipeline_location_title

    override fun createForm() = PipelineLocationForm()

    override fun applyAnswerTo(answer: PipelineLocationAnswer, tags: Tags, geometry: ElementGeometry, timestampEdited: Long) {
        when (answer) {
            UNDERGROUND -> tags["man_made=pipeline:location"] = "underground"
            OVERGROUND -> tags["man_made=pipeline:location"] = "overground"
            OVERHEAD -> tags["man_made=pipeline:location"] = "overhead"
            UNDERWATER -> tags["man_made=pipeline:location"] = "underwater"
        }
    }
}
