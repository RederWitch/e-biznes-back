# --- !Ups

INSERT INTO category(name, description)
VALUES ('mis pluszowy', ''),
       ('maskotki zwierzat', ''),
       ('lalki szmaciane', '');

INSERT INTO product (name, description, categoryId, price, weight, height, width)
VALUES ('DUŻY MIŚ PLUSZOWY',
        'Bacon ipsum dolor amet jerky pork loin flank landjaeger t-bone, pork chop pancetta pastrami fatback. Pig sirloin biltong boudin, t-bone doner filet mignon rump pork chop shoulder tri-tip ball tip.',
        1, 89, 100, 60, 40),
       ('GIGANT MIŚ PLUSZOWY',
       'Pork chop bresaola chicken frankfurter. Prosciutto tail turducken t-bone chicken strip steak pork loin shoulder andouille ribeye venison burgdoggen boudin ball tip rump. Capicola drumstick andouille,',
       1, 115, 300, 160, 100),
       ('MIŚ W KOSZULCE',
       'Porchetta t-bone ball tip, turducken pig ground round meatloaf. Pork shoulder tenderloin cow pig sausage ribeye venison spare ribs filet mignon ham hock pastrami rump bacon.',
       1, 55, 30, 30, 20),
       ('SZMACIANA LALKA RÓŻ',
       'Jowl pork loin flank, strip steak shoulder salami porchetta tri-tip. Hamburger shankle prosciutto, ball tip frankfurter kielbasa t-bone filet mignon capicola tenderloin strip steak andouille sirloin tri-tip bresaola.',
        3, 35, 350, 90, 60),
       ('SZMACIANA LALKA BŁĘKIT',
        'Pork jerky kielbasa bacon, boudin tri-tip flank frankfurter kevin chislic shoulder beef ribs pig meatloaf turkey. Rump ham jowl, meatball swine venison spare ribs tri-tip. Sausage strip steak pork belly, beef ribs picanha tri-tip frankfurter chuck.',
        3, 35, 350, 90, 60),
       ('PLUSZOWA ZEBRA',
        'Porchetta t-bone ball tip, turducken pig ground round meatloaf. Pork shoulder tenderloin cow pig sausage ribeye venison spare ribs filet mignon ham hock pastrami rump bacon.',
        2, 49, 60, 90, 120),
        ('PLUSZOWA JASZCZURKA',
        'Filet mignon burgdoggen buffalo leberkas pig sausage pancetta. Picanha leberkas cow turducken, spare ribs chicken pork loin jowl turkey boudin bresaola short ribs.',
        2, 19, 10, 20, 40),
        ('PLUSZOWY PIES PODUSZKA',
        'Shoulder bresaola spare ribs beef, tri-tip sirloin pork loin filet mignon hamburger corned beef leberkas. Spare ribs burgdoggen venison kevin ham tongue bresaola shoulder brisket chislic short ribs biltong buffalo pork loin sausage.',
         2, 120, 30, 40, 90),
        ('PLUSZOWY KOŃ',
        'Shoulder bresaola spare ribs beef, tri-tip sirloin pork loin filet mignon hamburger corned beef leberkas. Spare ribs burgdoggen venison kevin ham tongue bresaola shoulder brisket chislic short ribs biltong buffalo pork loin sausage.',
        2, 74, 50, 40, 90);


# --- !Downs