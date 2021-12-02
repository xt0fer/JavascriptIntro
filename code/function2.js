function getRoomTemp() {
    return thermostat.temp;
}

function doHeat(furnace, temperature) {
    if (temperature <= 67) {
        furnace.startHeating();
    }
    return;
}

doHeat(furnace, getRoomTemp());