package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void checkIn_occupy_room_and_make_dirty() {
        Room room = new Room(2, 100.0, false, false);

        room.checkIn();

        assertTrue(room.getIsOccupied());
        assertTrue(room.getIsDirty());
    }

    @Test
    public void checkOut_deoccupy_room_but_keep_dirty() {
        Room room = new Room(2, 100.0, true, true);

        room.checkOut();

        assertFalse(room.getIsOccupied());
        assertTrue(room.getIsDirty());
    }

    @Test
    public void cleanRoom_make_clean() {
        Room room = new Room(2, 100.0, false, true);

        room.cleanRoom();

        assertFalse(room.getIsDirty());
    }

}
