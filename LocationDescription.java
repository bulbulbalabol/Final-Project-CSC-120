import java.util.Arrays;

public class LocationDescription {
    public static Location createSkullRock() {
        return new Location(
            "Skull Rock",
            "Towering along the coast like a forgotten sentinel, Skull Rock is a massive stone 
            formation eerily shaped like a human skull. Wind howls through its eye sockets, creating 
            haunting whistles that echo for miles. Moss and salt cling to the jagged surface, and below, 
            a dark cave mouth gapes wide like an open jaw—daring you to enter. The atmosphere is heavy, as if the very rock remembers ancient secrets.\r\n" + //
                                "",
            Arrays.asList("Look inside the cave", "Stay outside and look around", "Check the surface of Skull Rock Mountain"),
            Arrays.asList(
                "You wander into the cave and get hopelessly lost for three hours. It's cold, dark, and silent. You find nothing.",
                "As you wait, a man-eating seagull swoops down and attacks! Game over.",
                "You scale the side of the rock and discover a hollow hole. Inside it glimmers a piece of the puzzle."
            )
        );
    }

    public static Location createBlueMountains() {
        return new Location(
            "Blue Mountains",
            "🏔️ Misty peaks blanketed in evergreen forests...",
            Arrays.asList("🧗 Climb to the peak", "🐐 Follow the goats", "🔍 Look around"),
            Arrays.asList(
                "You discover a chest with food and water!",
                "A Skinwalker mimicked goats—you're killed!",
                "You find a glinting bottle with a puzzle piece! 🧩"
            )
        );
    }

    public static Location createMonsterCove() {
        return new Location(
            "Monster Cove",
            "🌊 This forgotten coast is cursed by folklore and fear...",
            Arrays.asList("🚣 Explore by boat", "🍽️ Check abandoned diner", "🌉 Cross the mighty bridge"),
            Arrays.asList(
                "Your boat sinks—sea creatures devour you.",
                "You find bagels... and a puzzle piece! 🧩",
                "You get lost on the path. Skulls whisper. Yikes!"
            )
        );
    }

    public static Location createTropicalForest() {
        return new Location(
            "Tropical Forest",
            "🌴 Lush, alive, and pulsing with strange energy...",
            Arrays.asList("🍈 Pick glowing fruit", "🦔 Follow glowing hedgehog", "🛤️ Follow glowing path"),
            Arrays.asList(
                "You hallucinate and pass out.",
                "You find a puzzle piece in a hollow tree! 🧩",
                "A Kelpie drags you to her lair. Game over!"
            )
        );
    }

    public static Location createMermaidLagoon() {
        return new Location(
            "Mermaid Lagoon",
            "🧜‍♀️ A place of shimmering water and timeless song...",
            Arrays.asList("🧪 Drink pink potion", "🎶 Follow the song", "👀 Look around"),
            Arrays.asList(
                "You grow a tail—Mermaids lead you to a puzzle piece! 🧩",
                "You're sacrificed to the Siren goddess.",
                "A giant bee stings you into a coma."
            )
        );
    }

    public static Location createPixieHollow() {
        return new Location(
            "Pixie Hollow",
            "🧚 A whimsical grove filled with magic and giggles...",
            Arrays.asList("🧁 Eat glowing cupcake", "🌟 Follow silver trail", "🪑 Sit and watch"),
            Arrays.asList(
                "You shrink! The pixies give you a puzzle piece! 🧩",
                "50 years pass... you die old and confused.",
                "You sneeze glitter forever."
            )
        );
    }

    public static Location createIceLand() {
        return new Location(
            "Ice Land",
            "❄️ Frozen land of whispering snow and biting wind...",
            Arrays.asList("🧊 Break the icicle", "🕯️ Enter glowing cave", "☃️ Build snowman"),
            Arrays.asList(
                "Tree cracks open—shimmering shard inside! 🧩",
                "A frost beast awakens and traps you. RIP.",
                "Snowman speaks and vanishes, leaving enchanted ice."
            )
        );
    }

    public static Location createPirateCamp() {
        return new Location(
            "Pirate Camp",
            "🏴‍☠️ Rugged camp by the cliffs, full of treasure and trouble...",
            Arrays.asList("🗝️ Open skull chest", "💪 Arm-wrestle pirates", "🕵️ Sneak into captains tent"),
            Arrays.asList(
                "Chest explodes in smoke—inside, a puzzle piece! ",
                "You pass out from pirate grog.",
                "Parrot screams 'THIEF!' Pirates chase you."
            )
        );
    }

    public static Location createDesert() {
        return new Location(
            "Desert",
            "🏜️ Endless sands and ancient whispers...",
            Arrays.asList("🏝️ Investigate oasis", "⛏️ Dig where something glinted", "🌄 Climb dune"),
            Arrays.asList(
                "The oasis vanishes, but you find a puzzle piece!",
                "Genie puts you to nap—3 days pass.",
                "You slide into a camel caravan. Confused camels."
            )
        );
    }
}
