# Installer la release

## Android

### Récupérer l'APK

Les APK des différentes releases sont disponibles dans l’onglet **Releases** du dépôt GitHub.  
Chaque sprint possède sa release dédiée.

👉 Lien vers l’APK du Sprint 3 :  [Lien](https://github.com/HugoTHOLLON/StreetCompleteSAE_S5/releases/download/Sprint3/NonOfficial-StreetComplete.apk)

Si le lien ne fonctionne pas, rendez-vous dans l’onglet *Releases* du dépôt et récupérez l’APK manuellement.

### Installer l'APK

- Téléchargez l’APK sur votre téléphone ou transférez-le depuis votre ordinateur
- Ouvrez votre gestionnaire de fichiers et recherchez l’APK téléchargé.
- Touchez-le pour lancer l’installation. 
- Si Android affiche un message concernant les “sources inconnues”, autorisez l’installation (sauf si vous pensez que l'on a de mauvaises intentions envers votre téléphone).
- Une fois installée, l’application apparaît comme n’importe quelle autre appli sur votre téléphone.

Vous pouvez maintenant lancer StreetComplete.

## Si vous n’avez pas d’appareil Android

Il est possible de tester l’application via un émulateur Android sur ordinateur.

### Cloner le dépôt

Si vous avez besoin de consulter la release vous savez probablement cloner un repo, mais pour fournir le lien et juste au cas où, voici un petit rappel.

- Copier [ce lien](https://github.com/HugoTHOLLON/StreetCompleteSAE_S5)
- Ouvrir un terminal git (comme Git Bash par exemple)
- Vous placer dans un dossier approprié à l'aide de la commande
  ```bash
  cd [chemin vers le dossier]
  ```
- Cloner le dépot à l'aide de la commande
  ```bash
  git clone [le lien du repo]
  ```
- Puis déplacez vous sur la bonne branche (probablement quelque chose comme "Sprint3")
  ```bash
  git checkout [branche]
  ```

### Lancer l’application avec Android Studio

- Installer Android Studio (de préférence Narval 3, étant notre environnement de dev nous pouvons garantir qu'il fonctionne).
- Ouvrez le projet dans Android Studio.
- Vérifiez que vous êtes sur la bonne branche (Sprint 3 ou autre) via le menu en haut à droite.
- Créez ou sélectionnez un émulateur Android.
- Lancez l'application avec la flèche verte en haut à droite ou en appuyant sur Maj + F10.
(Si la flèche est grisée, une bannière bleue doit être visible en haut de l'interface de dev. Cliquez sur synchroniser. Après quelques minutes la flèche devrait devenir verte et permettre de lancer l'application.)
- Le premier démarrage peut prendre quelques minutes le temps du build. Prenez un café en attendant que l'émulateur lance l'application.
