#!/bin/bash

# run docker-compose
docker-compose up -d

# Si la commande docker-compose up a réussi
if [ $? -eq 0 ]; then
    echo ""
    echo "docker-compose finish successfully !"
    echo ""
    
    fichier="postgres.env"
	
	port=`sed -n '2s/^[^=]*=//p' $fichier`
	echo "Postgres port => $port" 
	
	echo ""
	
	user=`sed -n '3s/^[^=]*=//p' $fichier`
	echo "Postgres user => $user" 
	
	echo ""
	
	pwd=`sed -n '4s/^[^=]*=//p' $fichier`
	echo "Postgres password => $pwd" 
	
	echo ""
	
	db=`sed -n '5s/^[^=]*=//p' $fichier`
	echo "Postgres database => $db" 
	
	echo ""
	
	pgadminemail=`sed -n '7s/^[^=]*=//p' $fichier`
	echo "PGAdmin email => $pgadminemail" 
	
	echo ""
	
	pgadminpassword=`sed -n '8s/^[^=]*=//p' $fichier`
	echo "PGAdmin password => $pgadminpassword" 
	
	echo ""
	
	pgadmiport=`sed -n '9s/^[^=]*=//p' $fichier`
	echo "PGAdmin run on http://localhost:$pgadmiport" 
else
    echo "docker-compose failed !"
fi
