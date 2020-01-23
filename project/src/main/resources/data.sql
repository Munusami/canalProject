INSERT INTO abonne (prenom, nom) VALUES
  ('kentish', 'munusami'),
  ('serge', 'blanco'),
  ('captain', 'america');
  
INSERT INTO adresse (active, pays, rue, codePostal, ville, id_abonne) VALUES
(false, 'france', '5 rue voltaire', '70008', 'paris', 1),
(true, 'pologne', '10 rue zerrt', '', 'varsovie', 1),
(false, 'france', '12 rue de la paix', '70009', 'paris', 1);
  
INSERT INTO contrat (canal, condition, id_adresse, id_abonne) VALUES
('FACE', 'avec date effet', 1, 1),
('EC', 'avec date effet', 2, 1),
('FACE', 'avec date effet', 3, 1);