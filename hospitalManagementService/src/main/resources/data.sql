INSERT INTO patient
(name, gender, birth_date, email, blood_group, created_at)
VALUES
    ('Ali Raza', 'Male', '1995-03-15', 'ali.raza@example.com', 'A_POSITIVE', CURRENT_TIMESTAMP),
    ('Sara Khan', 'Female', '1998-07-22', 'sara.khan@example.com', 'B_POSITIVE', CURRENT_TIMESTAMP),
    ('Ahmed Hassan', 'Male', '1990-11-08', 'ahmed.hassan@example.com', 'O_POSITIVE', CURRENT_TIMESTAMP),
    ('Ayesha Malik', 'Female', '2001-01-30', 'ayesha.malik@example.com', 'AB_POSITIVE', CURRENT_TIMESTAMP),
    ('Usman Tariq', 'Male', '1987-05-19', 'usman.tariq@example.com', 'O_NEGATIVE', CURRENT_TIMESTAMP),
    ('Fatima Noor', 'Female', '1996-09-12', 'fatima.noor@example.com', 'A_NEGATIVE', CURRENT_TIMESTAMP),
    ('Hamza Iqbal', 'Male', '1993-12-25', 'hamza.iqbal@example.com', 'B_NEGATIVE', CURRENT_TIMESTAMP),
    ('Hira Shah', 'Female', '1999-04-07', 'hira.shah@example.com', 'AB_NEGATIVE', CURRENT_TIMESTAMP),
    ('Bilal Ahmed', 'Male', '1985-08-16', 'bilal.ahmed@example.com', 'A_POSITIVE', CURRENT_TIMESTAMP),
    ('Maham Siddiqui', 'Female', '2000-06-11', 'maham.siddiqui@example.com', 'O_POSITIVE', CURRENT_TIMESTAMP),
    ('Zain Abbas', 'Male', '1992-02-28', 'zain.abbas@example.com', 'B_POSITIVE', CURRENT_TIMESTAMP),
    ('Maryam Asif', 'Female', '1997-10-03', 'maryam.asif@example.com', 'A_POSITIVE', CURRENT_TIMESTAMP),
    ('Hassan Ali', 'Male', '1989-01-14', 'hassan.ali@example.com', 'O_NEGATIVE', CURRENT_TIMESTAMP),
    ('Iqra Javed', 'Female', '2002-03-21', 'iqra.javed@example.com', 'B_POSITIVE', CURRENT_TIMESTAMP),
    ('Fahad Mahmood', 'Male', '1994-07-05', 'fahad.mahmood@example.com', 'AB_POSITIVE', CURRENT_TIMESTAMP),
    ('Laiba Yousaf', 'Female', '2003-11-17', 'laiba.yousaf@example.com', 'O_POSITIVE', CURRENT_TIMESTAMP),
    ('Saad Qureshi', 'Male', '1988-09-29', 'saad.qureshi@example.com', 'A_NEGATIVE', CURRENT_TIMESTAMP),
    ('Anum Sheikh', 'Female', '1995-12-06', 'anum.sheikh@example.com', 'B_NEGATIVE', CURRENT_TIMESTAMP),
    ('Danish Rehman', 'Male', '1991-05-23', 'danish.rehman@example.com', 'AB_NEGATIVE', CURRENT_TIMESTAMP),
    ('Komal Arshad', 'Female', '1999-08-31', 'komal.arshad@example.com', 'O_POSITIVE', CURRENT_TIMESTAMP);


INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Ahmed Khan', 'Cardiologist', 'ahmed.khan@hospital.com'),
    ('Dr. Sara Malik', 'Dermatologist', 'sara.malik@hospital.com'),
    ('Dr. Ali Hassan', 'Neurologist', 'ali.hassan@hospital.com'),
    ('Dr. Ayesha Raza', 'Pediatrician', 'ayesha.raza@hospital.com'),
    ('Dr. Usman Tariq', 'Orthopedic Surgeon', 'usman.tariq@hospital.com'),
    ('Dr. Fatima Noor', 'Gynecologist', 'fatima.noor@hospital.com'),
    ('Dr. Hamza Iqbal', 'General Physician', 'hamza.iqbal@hospital.com'),
    ('Dr. Hira Shah', 'Ophthalmologist', 'hira.shah@hospital.com'),
    ('Dr. Bilal Ahmed', 'ENT Specialist', 'bilal.ahmed@hospital.com'),
    ('Dr. Maham Siddiqui', 'Psychiatrist', 'maham.siddiqui@hospital.com'),
    ('Dr. Zain Abbas', 'Urologist', 'zain.abbas@hospital.com'),
    ('Dr. Maryam Asif', 'Endocrinologist', 'maryam.asif@hospital.com'),
    ('Dr. Hassan Ali', 'Pulmonologist', 'hassan.ali@hospital.com'),
    ('Dr. Iqra Javed', 'Oncologist', 'iqra.javed@hospital.com'),
    ('Dr. Fahad Mahmood', 'Nephrologist', 'fahad.mahmood@hospital.com'),
    ('Dr. Laiba Yousaf', 'Rheumatologist', 'laiba.yousaf@hospital.com'),
    ('Dr. Saad Qureshi', 'Gastroenterologist', 'saad.qureshi@hospital.com'),
    ('Dr. Anum Sheikh', 'Radiologist', 'anum.sheikh@hospital.com'),
    ('Dr. Danish Rehman', 'Surgeon', 'danish.rehman@hospital.com'),
    ('Dr. Komal Arshad', 'Dentist', 'komal.arshad@hospital.com');