# keycloak
## Démarer keycloack
![image](https://user-images.githubusercontent.com/81756572/205338519-781cbde3-d77e-47b0-9545-0ea8bcbb133b.png)
## créer un user 
![image](https://user-images.githubusercontent.com/81756572/205338595-1d7077c4-d23e-468b-835a-99106ed3a696.png)
![image](https://user-images.githubusercontent.com/81756572/205338745-af139843-00ed-41e2-93d0-7f3f0a64928a.png)
##accéder à la console d'administration
![image](https://user-images.githubusercontent.com/81756572/205338910-99248431-757d-40d6-acb1-c55b93ca80ac.png)
## créer un realm
![image](https://user-images.githubusercontent.com/81756572/205339461-22bfe907-2713-41ce-b7c2-61fde64c56d3.png)
![image](https://user-images.githubusercontent.com/81756572/205339547-73471505-08ed-4374-ae9f-fbf6a609365d.png)
# créer les applications à sécuriser
![image](https://user-images.githubusercontent.com/81756572/205339896-019151a0-a399-4d8e-acd6-59e2729f02f2.png)
![image](https://user-images.githubusercontent.com/81756572/205340074-af6a7c19-d778-4a8f-8487-28aa0b8cad07.png)
![image](https://user-images.githubusercontent.com/81756572/205341047-a9c2412b-bc7e-4922-bd33-f182614b521f.png)
![image](https://user-images.githubusercontent.com/81756572/205341234-1805951f-0fcd-44ad-9a58-aa8180207fac.png)
## les utilisateurs qui ont le droit d'accéder 
![image](https://user-images.githubusercontent.com/81756572/205341635-7123b6a4-b414-4179-bfc6-94ea6a60d63a.png)
## lui créer un mdp :
![image](https://user-images.githubusercontent.com/81756572/205341958-8397a6da-15af-4522-9ed4-686165e3d747.png)
![image](https://user-images.githubusercontent.com/81756572/205341985-92fb9b27-c812-4029-9e0e-27f3635a8733.png)
## Créer des roles : 
![image](https://user-images.githubusercontent.com/81756572/205342402-1cd7e55b-1d0c-4043-a3ce-be5019b62039.png)
![image](https://user-images.githubusercontent.com/81756572/205342485-3e50523c-e6a5-4275-8499-a6a162d03a9b.png)
![image](https://user-images.githubusercontent.com/81756572/205342712-01d06fe5-2825-4862-a170-48153c37e380.png)
## Attribuer les roles aux utilisateurs 
![image](https://user-images.githubusercontent.com/81756572/205342943-d566e43b-6844-4e40-b9cb-06e082a5698e.png)
![image](https://user-images.githubusercontent.com/81756572/205343070-93f5cf75-69f4-4e08-8d9f-fa795051fccc.png)
![image](https://user-images.githubusercontent.com/81756572/205343492-c2aa7e6f-784e-436d-a0dc-fa2baac75809.png)
![image](https://user-images.githubusercontent.com/81756572/205343565-32f5e44d-ada8-49c0-8361-abc060fad62a.png)

#Vérifier une authentification avec postman 
![image](https://user-images.githubusercontent.com/81756572/205344341-3d2a9db5-40e9-41ab-9972-e77a1ad975a1.png)
![image](https://user-images.githubusercontent.com/81756572/205344930-439659ec-f1fa-44bb-b049-b0aa7c9b1698.png)
![image](https://user-images.githubusercontent.com/81756572/205345570-68082f90-1658-4e8e-9ca6-40fa616d5757.png)
![image](https://user-images.githubusercontent.com/81756572/205345686-f0138fef-9cab-4476-b7b4-52e8a089c2fa.png)
## la clé public
![image](https://user-images.githubusercontent.com/81756572/205346248-3bb1294f-5699-4654-ab21-7453eb5bef38.png)
![image](https://user-images.githubusercontent.com/81756572/205346127-256363e2-b570-40f6-993e-b077cbd03209.png)
## demander un nouvel access token using le refresh token
![image](https://user-images.githubusercontent.com/81756572/205346769-641ae067-2202-4a79-9cf4-8fba28f18db2.png)
## 3ème façon pour s'identifier : client id & client secret 
### activer client authentication 
![image](https://user-images.githubusercontent.com/81756572/205347884-67429aa7-a114-41c1-ad22-deba2acd6403.png)
### copier client secret
![image](https://user-images.githubusercontent.com/81756572/205347974-f977447f-3d3c-414f-95a6-1575ae6cc4c7.png)
![image](https://user-images.githubusercontent.com/81756572/205348833-efa0c6aa-8183-4395-9c73-781a8fb4aa99.png)



# -Sécuriser avec Keycloak les applications Products-App (Frontend avec thymeleaf) et Supplier-service (Micro-service backend)
## Create realm 
![image](https://user-images.githubusercontent.com/81756572/205376556-5f00c647-ebb0-433a-9a60-816dc2b7f02a.png)
![image](https://user-images.githubusercontent.com/81756572/205376595-09e73244-8ef3-4b89-ae12-2d9d8c33afc9.png)

## Create client
![image](https://user-images.githubusercontent.com/81756572/205378214-96746343-ae49-4fe0-83f3-edcb2cb72615.png)
![image](https://user-images.githubusercontent.com/81756572/205378142-4b34be71-c124-419f-b0b4-634d616b1003.png)


## Create user + mdp
![image](https://user-images.githubusercontent.com/81756572/205389497-475f0649-35ea-4e84-8d33-5b6617055664.png)
![image](https://user-images.githubusercontent.com/81756572/205391317-a1ba0605-56dd-48b1-9d12-f7a3858e1fa6.png)

![image](https://user-images.githubusercontent.com/81756572/205390489-acdbafaa-223f-4ec7-a644-3d4b5a0da9c9.png)
![image](https://user-images.githubusercontent.com/81756572/205390552-75b90e8c-e607-4685-a2b8-76b69a40406f.png)
![image](https://user-images.githubusercontent.com/81756572/205391068-d66631eb-0db1-4ace-b345-125a85b5aaca.png)

## add roles
![image](https://user-images.githubusercontent.com/81756572/205391580-9207a50b-caae-4fab-b687-aab85d87fabf.png)
![image](https://user-images.githubusercontent.com/81756572/205391814-9ea07304-c36a-44a8-93ea-e1d9fd422006.png)
![image](https://user-images.githubusercontent.com/81756572/205391908-2613d5a1-6a12-4e08-8e95-806ebaf0add3.png)

## Attribuer les roles
![image](https://user-images.githubusercontent.com/81756572/205392259-e6a81216-611f-4d52-aa85-bba2d82519d5.png)
![image](https://user-images.githubusercontent.com/81756572/205392522-1e1cb7cf-d0f9-44d2-8704-8e7d75bf416a.png)
![image](https://user-images.githubusercontent.com/81756572/205392741-4408660d-7e61-46b1-876d-e13f61e86923.png)

## verifier l'authentif avec avec postman et jwt 
![image](https://user-images.githubusercontent.com/81756572/205395123-20d8b019-09f1-4eef-93d2-c53836ea1b2e.png)
![image](https://user-images.githubusercontent.com/81756572/205395222-b529620d-abb6-4c78-bfe2-7cb6b8274c5c.png)


# Sécuriser products-app
## ajouter les dépendances 
![image](https://user-images.githubusercontent.com/81756572/205401136-a6894b63-6d4f-4c6a-b1a7-d2ce0fd07f40.png)
![image](https://user-images.githubusercontent.com/81756572/205403367-eb03ce31-e953-4537-8c3f-2059d33fa56b.png)


## Keyloak security config 
![image](https://user-images.githubusercontent.com/81756572/205401249-81524289-880f-4481-a34a-53eb0a39d4d9.png)

## Application properties
![image](https://user-images.githubusercontent.com/81756572/205401323-f22091ce-3e23-4d2b-8fe7-8433bc3d5d17.png)

## keyloak adapter config
![image](https://user-images.githubusercontent.com/81756572/205401375-61849ca7-720a-4190-b736-ac428ef5a33e.png)

## accès à product après connexion
![image](https://user-images.githubusercontent.com/81756572/205402784-ae5baede-4b2f-4f2a-b40d-bf1ed480a38b.png)

![image](https://user-images.githubusercontent.com/81756572/205401531-3368748c-0839-4b1b-a5e5-cfe994d2a8ba.png)

## ajout du logout
![image](https://user-images.githubusercontent.com/81756572/205402579-7d5548db-4986-4577-8cc1-4113a20a2525.png)
![image](https://user-images.githubusercontent.com/81756572/205402601-1ae48bde-dd89-4575-95f1-c90e6b776b63.png)
 ## pour afficher le nom au lieu du id
 ![image](https://user-images.githubusercontent.com/81756572/205402684-c9d5d9e2-61b7-4dfb-bb0b-de63530be10e.png)
![image](https://user-images.githubusercontent.com/81756572/205402816-84e24540-97f1-4a73-8d13-9ab21b7dbbe6.png)


#Suppliers-service 

![image](https://user-images.githubusercontent.com/81756572/205403786-bd19f637-3ece-42c6-b9a6-5a993ed9f31a.png)

## add public key to the settings
![image](https://user-images.githubusercontent.com/81756572/205404716-beacd2e6-cf8d-4078-b5a4-4b4342fd1fa9.png)

## consulter le jwt 
![image](https://user-images.githubusercontent.com/81756572/205436089-8715cbaa-1c66-44d6-8a53-5306c8aa5a76.png)
![image](https://user-images.githubusercontent.com/81756572/205436173-fd665950-77bc-4804-a71d-154fd8e63fe6.png)

## utiliser rest template 
### faire communiquer les micro-services
![image](https://user-images.githubusercontent.com/81756572/205436372-16c34254-3b01-43e1-8635-2f701bb795b1.png)
![image](https://user-images.githubusercontent.com/81756572/205436594-2067fdac-27ca-4a12-aa2a-9bb5a11cdd29.png)
![image](https://user-images.githubusercontent.com/81756572/205436822-05b7c306-0a7f-4b9e-b75e-874ed854b75a.png)
![image](https://user-images.githubusercontent.com/81756572/205436834-09931bcb-6eb5-4725-99de-e7552d378c3b.png)
![image](https://user-images.githubusercontent.com/81756572/205436846-c5cbb281-66eb-401b-94fb-600bd0b3b170.png)
![image](https://user-images.githubusercontent.com/81756572/205437031-2dfa4ed4-ccb1-4f48-aad2-ae885ee72dc3.png)
![image](https://user-images.githubusercontent.com/81756572/205437133-db1ea7f4-5e26-4146-b779-4cbfb1633822.png)
![image](https://user-images.githubusercontent.com/81756572/205437475-57c027f8-a256-42fe-b7cf-6689f6bdc2a6.png)

## User registration
![image](https://user-images.githubusercontent.com/81756572/205438213-2519b750-c60d-4ca6-a447-b96b1879e89c.png)
![image](https://user-images.githubusercontent.com/81756572/205438232-18225536-d71e-4c95-b383-727c5666cb97.png)
![image](https://user-images.githubusercontent.com/81756572/205438249-eeadadd1-f5a9-46c9-8f57-4541ac136e45.png)
![image](https://user-images.githubusercontent.com/81756572/205438269-45aff372-51a3-4abf-b40f-ee3579c927c6.png)

## Contrainte de sécurité 
![image](https://user-images.githubusercontent.com/81756572/205438426-51af22dc-304a-47ea-8c42-96f74ac8b530.png)


