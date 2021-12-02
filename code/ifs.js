if (age < 18) {
    console.log('under age');
}

if (playerOne.alive() == true) {
    playGameTurn(playerOne);
} else {
    announceDeath(playerOne);
}