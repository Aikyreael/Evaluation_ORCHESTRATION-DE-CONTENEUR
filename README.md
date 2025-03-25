# Evaluation_ORCHESTRATION-DE-CONTENEUR

### Simple POC d'un chat qui affiche tous les messages en BDD en consommant une API REST pour l'évaluation docker
![image](https://github.com/user-attachments/assets/d9252477-aecb-4c97-bc2c-11a347ae5984)

### Pour lancer les Dockerfile depuis le root du dossier projet
docker build -t backend-test -f utils/backend.Dockerfile .   
docker build -t frontend-app -f utils/frontend.Dockerfile .  

### Pour lancer le docker-compose depuis le root du dossier projet
docker compose -f utils/docker-compose.yml up -d

### Volumes docker
Une fois les images déployer vous pouvez trouvez les volumes au endroits suivants
Logs : orchestration-eval_logs/app.logs
Base de données : orchestration-eval_db

### Logs de toutes les requêtes et expections
![image](https://github.com/user-attachments/assets/0f67bf83-f89f-4444-891e-e67c15c16e47)

### L'intégration continue qui se lance toute seul lors d'un push sur main
![image](https://github.com/user-attachments/assets/0c57f1d3-f09e-41d8-9395-8ff518cdcf6b)

### Upload des images sur docker hub si les tests sont validés 
![image](https://github.com/user-attachments/assets/ab849ae0-c626-4cec-b97a-2cc3b0dbe26d)

### Notification sur discord après l'upload des images
![image](https://github.com/user-attachments/assets/4a6a625c-6760-4454-b9ae-f4ee1afef306)

