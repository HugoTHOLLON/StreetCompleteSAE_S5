package de.westnordost.streetcomplete.quests.boat_lock_self_service

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.data.osm.geometry.ElementGeometry
import de.westnordost.streetcomplete.data.osm.osmquests.OsmFilterQuestType
import de.westnordost.streetcomplete.data.quest.AndroidQuest
import de.westnordost.streetcomplete.data.user.achievements.EditTypeAchievement.OUTDOORS
import de.westnordost.streetcomplete.osm.Tags
import de.westnordost.streetcomplete.quests.YesNoQuestForm
import de.westnordost.streetcomplete.util.ktx.toYesNo

class AddBoatLockSelfService : OsmFilterQuestType<Boolean>(), AndroidQuest {

    override val elementFilter = """ ways with lock=yes and !self_service """

    override val changesetComment = "Specify if a boat lock is self service or no"
    override val wikiLink = "Tag:lock"
    override val icon = R.drawable.ic_quest_lock_boat
    override val achievements = listOf(OUTDOORS)

    override fun getTitle(tags: Map<String, String>) = R.string.quest_boat_lock_self_service_title

    override fun createForm() = YesNoQuestForm()

    override fun applyAnswerTo(answer: Boolean, tags: Tags, geometry: ElementGeometry, timestampEdited: Long) {
        tags["self_service"] = answer.toYesNo()
    }
}
