# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

# Arbeidsfordeling
Nilab sarwari
studentnr: s362083

Oppgavebeskrivelse

oppgave 1
først så sjekker vi om arrayet er ikke tom hvis den var det så returerner vi NOsuchElemetsfound Exception.
for løkke for å sjekke a[i]>a[i+1].
Inn i for løkke så lager vi en temp slik at vi kan beholde a[i] vis den var støre enn a[i+1] 
også kan de to bytte plass.
Når vi ser at vi ikke har bytte noe så avsluttr vi før løkke.
Det verste tilfelle er den støreste tallet er i begynelsen av Arrayet.
Det best tilfellet er når den størest tallet er sist og det minst tallet er først.
Gjenomsnitten finner ved å tenke oss at at tallet ligger i midten og det antall ombyttinger som skjer er n/2;
I å finn antall ombyttinger så bruker vi den nesten den førrige methode
Vi bare legger +1 for hvergang a[i] byttes med a[i+1].

oppgave2:
I oppgave 2 så lager vi en methode som tar en arrayet og returernerer et tall
som viser til hvor mange ulike tallet er det i Arrayet.
Først så sjekker vi om Arrayet er tom hvis den er det så returnere vi 0.
Etter det så gå vi inn på for løkke og sjekker om arrayet er sortert.
hvis den var ikke det så returnere vi IllegalStatEception
Hvis den var sortert , da sjekker vi om at a[i]!=a[i+1] hvis de var ulike så plusser vi antallUlike med 1.

oppave3:
Først så lager vi en methode som tar imot et array
og returnere et tall som viser antall ulike tall som finnes i Arrayet.
Vi sjekker om Arrayer er tom hvis ja så returnerer vi 0;
lager en variabel som teller antall Ulike sorter.
Vi lager en for løkke og inn i før løkke så laer vi en boolean brukes under sammenligning.
Vi lager en ny for løkke fordi a[i] må sammenlignes med A[J] osv.
inn i for løkke så sjekker vi om løkke sammenligning a[i]== a[j] hvis ja så går vi ut av løkke.
til slutt hvis det var ulike så går vi ut av løkke.

oppgave4:

Føst så deklarer vi en methode som tar inn et Arrayet og sortere den mellom de oddetall og partall.
Prinsippet for dette Oppgave er slik at vi har brukt to pekker en fra høyre og en fra venste
til å sammenligne eller dele.
Vi sammenligne både fra høyre og venstre og bytter plass på det.
for å løse oppgaven har brukt jeg patisjonering og bytt methode fra kompendiet Online.

oppgave5:
Vi lager en methode som tar inn String og returerner ikke noe.
Først så tar vi den siste element i et temp veriabel slik at de blir ledig plass for at andre kan flytte seg videre.
Etter det så går vi i et løkke og fyller postion til nest med den 
førrige element og det starter vi fra slutten av arrayet.
Til slutt så har vi flyttet alle elementene et plass og A[0] blir ledig.
Da setter vi a[0]=temp; som var den siste elemnte i Arrayet.

oppgave7a:

I Oppgave 7a så deklarer vi en methode som tar inn to String og returernere en langString tilbake.
Oppgaven er løst ved hjelp av en før løkke
Vi tenker sånn at vi ser om i<S.lenght så legger vi det i String som skal out og samme gjør vi ved t
Til slutt så returerner vi den Sammensatte String.

7b:
Vi deklarer en methode som tar inn String og fletter den sammen og returnere en String.
Vi først finner ut hva length på det String Arrayet vi har.
Etter det så repeterer vi Oppgave 7a.









