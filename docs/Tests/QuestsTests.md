# Quests

## Sprint 1

### Where is this first aid kit located?

#### Issue

#6457

#### Quest folder

`quests/first_aid_kit/`

#### Overpass turbo query

```
node["emergency"="first_aid_kit"][!description][!"first_aid_kit:description"]["access"!~"no|private"]({{bbox}});
out geom meta;
```

#### Test location

GANAYE IN STOCK, Rue Vaucanson, Martigues

Coordinates: 43.3953386 / 5.0352321 (lat/lon)

#### Test result

**Successful**

![OpenStreetMap node before the quest completion](test_assets/first_aid_kit_quest_node_before_quest.png)
_OpenStreetMap node before the quest completion_

![OpenStreetMap node after the quest completion](test_assets/first_aid_kit_quest_node_after_quest.png)
_OpenStreetMap node after the quest completion_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.

### In what direction can you ride this? Can you use this lift in both directions?

#### Issue:

#6457

#### Quest folder

`quests/aerialBothWay/`

#### Overpass turbo query

```
way["aerialway"][aerialway!~"cable_car|zipline"][!oneway]({{bbox}});
out geom meta;
```

#### Test location

Lac de Sames, France.

#### Test result

![OpenStreetMap way before the quest completion](test_assets/bothway_quest_before_quest.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/bothway_quest_after_quest.png)
_OpenStreetMap way after the quest completion_

### How many bikes can be charged here at the same time?

#### Issue

#6457

#### Quest folder

`quests/bike_charging_station_capacity/`

#### Overpass turbo query

```
nw["amenity"="charging_station"][!capacity]["bicycle"="yes"]({{bbox}});
out geom meta;
```

#### Test location

Lac de la Ramée, Chemin Anne Caroline Chausson

#### Test result

![OpenStreetMap node before the quest completion](test_assets/bike_charging_station_capacity_before_quest.png)
_OpenStreetMap node before the quest completion_

![OpenStreetMap node after the quest completion](test_assets/bike_charging_station_capacity_after_quest.png)
_OpenStreetMap node after the quest completion_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.

### How many scooters can be charged here at the same time?

#### Issue

#6457

#### Quest folder

`quests/scooter_charging_station_capacity/`

#### Overpass turbo query

```
nwr["amenity"="charging_station"][scooter~"yes|designated"][access!~ "private|no"][!capacity]({{bbox}});
out geom meta;
```

#### Test location

Coordinates: 41.3529202 / 2.0887408 (lat/lon)

Carrer de Baltasar Orio i Mercer

#### Test result

![OpenStreetMap node before the quest completion](test_assets/scooter_charging_station_capacity_before_quest.png)
_OpenStreetMap node before the quest completion_

![OpenStreetMap node after the quest completion](test_assets/scooter_charging_station_capacity_after_quest.png)
_OpenStreetMap node after the quest completion_

### Do you have to pay to park your motorcycle here?

#### Issue

#6457

#### Quest folder

`quests/parking_fee/`

#### Overpass turbo query

```
nwr["amenity"="motorcycle_parking"][access~"yes|customers|public"][!fee][!"fee:conditional"]({{bbox}});
out geom meta;
```

#### Test location

Rue de la charité, Toulouse

#### Test result

![OpenStreetMap way before the quest completion](test_assets/motorcycle_fee_before_quest.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/motorcycle_fee_after_quest.png)
_OpenStreetMap way after the quest completion_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.

### Does this aerialway transport bikes?

#### Issue

#6457

#### Quest folder

`quests/aerialway/`

#### Overpass turbo query

```
way["aerialway"~"cable_car|gondola|chair_lift"][!"aerialway:bicycle"][!"bicycle"]({{bbox}});
out geom meta;
```

#### Test location

Chemin: Taillas
Chemin: Chatégré

#### Test result

![OpenStreetMap way before the quest completion](test_assets/aerialway_bike_quest_before_quest_chategre.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/aerialway_bike_quest_after_quest_chategre.png)
_OpenStreetMap way after the quest completion_

![OpenStreetMap way before the quest completion](test_assets/aerialway_bike_quest_before_quest_taillas.png)
_OpenStreetMap way before the quest completion with the "no_signed" answer_

![OpenStreetMap way after the quest completion](test_assets/aerialway_bike_quest_after_quest_taillas.png)
_OpenStreetMap way after the quest completion with the "no_signed" answer_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.

## Sprint 2

### Who may access this tower?

#### Issue

#6502

#### Quest folder

`quests/tower_access/`

#### Overpass turbo query

```
[out:json][timeout:25];
// gather results
nwr["man_made"="tower"]["tower:type"="observation"][!military][!access]["disused"!="yes"]["historic"="yes"]({{bbox}});
// print results
out geom;
```

#### Test location

Parc de les Valls d'Ax, Espagne.

#### Test result

![OpenStreetMap way before the quest completion](test_assets/tower_access_quest_before_quest.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/tower_access_quest_after_quest.png)
_OpenStreetMap way after the quest completion_

### Is firewood provided here?

#### Issue

#6517

#### Quest folder

`quests/firewood/`

#### Overpass turbo query

```
[out:json][timeout:25];
// gather results
(
  nwr["leisure"="firepit"][!"wood_provided"]["access"!~"no|private"]({{bbox}});
  
  nwr["amenity"="bbq"]["fuel"="wood"][!"wood_provided"]["access"!~"no|private"]({{bbox}});
  
  nwr["tourism"="wilderness_hut"]["fireplace"="yes"][!"wood_provided"]["access"!~"no|private"]({{bbox}});
);
// print results
out geom;
```

#### Test location

Gazebo, États-Unis (Californie).

#### Test result

![OpenStreetMap way before the quest completion](test_assets/firewood_quest_before.jpg)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/firewood_quest_after.jpg)
_OpenStreetMap way after the quest completion_

### Is this lock self_service?

#### Issue

#6540

#### Quest folder

`quests/boat_lock_self_service/`

#### Overpass turbo query

```
way["lock"="yes"][!self_service]({{bbox}});
out geom meta;
```

#### Test location

Écluse de Lalande

#### Test result

![OpenStreetMap way before the quest completion](test_assets/lock_self_service_quest_before_quest.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/lock_self_service_quest_after_quest.png)
_OpenStreetMap way after the quest completion_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.

## Sprint 3

### What's the topic of this information board? ("Rules" option added) 

#### Issue

#6147

#### Quest folder

`quests/board_type/`

#### Overpass turbo query

```
[out:json][timeout:25];
// gather results
nwr["tourism"="information"]["information"="board"]({{bbox}});
// print results
out geom;
```

#### Test location

Frouzins, France.

#### Test result

![OpenStreetMap way before the quest completion](test_assets/rules_quest_before.jpg)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/rules_quest_after.jpg)
_OpenStreetMap way after the quest completion_

### Is there hot water here?

#### Issue

#6548

#### Quest folder

`quests/hot_water/`

#### Overpass turbo query

```
way["amenity"="shower"]["fee"="no"][!"hot_water"][!"shower:hot_water"]({{bbox}});
out geom meta;
```

#### Test location

43.173917, 3.1857722

#### Test result

![OpenStreetMap way before the quest completion](test_assets/hot_water_quest_before_quest.png)
_OpenStreetMap way before the quest completion_

![OpenStreetMap way after the quest completion](test_assets/hot_water_quest_after_quest.png)
_OpenStreetMap way after the quest completion_

The changes have been rollbacked because we do not possess enough informations on the place to be sure of the information we gave.
