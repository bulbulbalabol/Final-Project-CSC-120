import java.util.Arrays;

public class LocationDescription {
    public static Location createSkullRock() {
        return new Location(
            "Skull Rock", 
            "Towering along the coast like a forgotten sentinel, Skull Rock is a massive stone formation eerily shaped like a human skull. Wind howls through its eye sockets, creating haunting whistles that echo for miles. Moss and salt cling to the jagged surface, and below, a dark cave mouth gapes wide like an open jaw—daring you to enter. The atmosphere is heavy, as if the very rock remembers ancient secrets.",
            Arrays.asList("Look inside the cave", "Call for help", "Explore the exterior of Skull Rock Mountain"),
            Arrays.asList(
                "You wander into the cave and get hopelessly lost for three hours. It's cold, dark, and silent. You find nothing. Game over.",
                "Your cry has attracted the wrong kind of attention! A man-eating seagull swoops down and attacks! Game over.",
                "You scale the side of the rock and discover a hollow hole. Inside it glimmers a piece of the puzzle."
            )
        );
    }

    public static Location createBlueMountains() {
        return new Location(
            "Blue Mountains",
            "The Blue Mountains stretch like ancient giants into the clouds, their misty peaks blanketed in evergreen forests and icy breath. The air is sharp and fresh, filled with the distant cries of wild goats and rustling winds. Crystalline streams carve paths down the slopes, glinting in the thin light. It's beautiful, but wild. Few make it through these ranges without facing trials.",
            Arrays.asList("Climb to the peak", "Follow the goats", "Look around"),
            Arrays.asList(
                "You journey for two days, braving steep paths and chilling winds. At the summit, you discover a chest containing fresh water and food. You're replenished and ready to move forward.",
                "You track the goat sounds — only to discover that a Skinwalker was mimicking a goat. Before you can react, you're killed. Game over.",
                "You notice something glinting beneath a massive boulder. Digging it out, you find a glass bottle. Inside: a puzzle piece!"
            )
        );
    }

    public static Location createMonsterCove() {
        return new Location(
            "Monster Cove",
            "This forgotten stretch of coast is cursed by folklore and fear. Monster Cove's waves crash rhythmically, yet the waters remain eerily still beneath the surface. Kelp drapes over jagged rocks like drowned hair. Abandoned shacks and a rotting pier suggest a once-thriving fishing village—now reclaimed by shadows. Locals whisper of sea monsters with too many eyes and never enough teeth.",
            Arrays.asList("Take the abandoned boat to explore the waters", "Go inside an abandoned diner with its lights on", "Take a loger path along the pier"),
            Arrays.asList(
                "Your boat sinks; sea creatures devour you. Game over.",
                "You find a suspicious fridge filled with  bagels, and what's that… a puzzle piece?!",
                "You get lost on the path. Skulls whisper... or do they? Game over."
            )
        );
    }

    public static Location createTropicalForest() {
        return new Location(
            "Tropical Forest",
            "Lush, alive, and pulsing with strange energy, this forest teems with vibrant flora and fantastical creatures. Vines spiral upward toward the sunlight while glowing fruits hang low and tempting. The air buzzes with unseen life—sparkling insects, rustling leaves, and soft animal calls. You see flashes of magical beasts: winged monkeys, glowing hedgehogs, and parrots with lion's manes. The jungle doesn't just live—it watches.",
            Arrays.asList("Pick the fruit", "Follow a hedgehog into the brush", "Follow the path"),
            Arrays.asList(
                "You eat a glowing fruit. It tastes amazing, but you hallucinate and pass out. Game over.",
                "You follow the hedgehog to a hollow tree. Inside: a puzzle piece!",
                "You follow the path, hear laughter. It's a shapeshifting Kelpie—she drags you into her lair. Game over."
            )
        );
    }

    public static Location createMermaidLagoon() {
        return new Location(
            "Mermaid Lagoon",
            "Tucked between coral cliffs and enchanted tides, Mermaid Lagoon is a place of shimmering water and timeless song. The surface ripples with hues of sapphire and teal, and delicate seashells litter the shore like scattered gems. Echoes of ethereal voices float through the mist. The air is salty-sweet, thick with magic and mystery. It's paradise—with sharp teeth behind the smiles.",
            Arrays.asList("Take a seashell as a cup and drink some of the sparkling water", "Follow the sounds of song to find the singers", "Sit on the beach and enjoy"),
            Arrays.asList(
                "You drink the potion and feel weird. Your pants feel tight and you don't feel your legs. Wait, where are your legs?! Your new tail suits you well — you can join the sirens now! They guide you to the ancient underwater palace... Inside is a puzzle piece!",
                "You track the sounds — it is gorgeous woman, with a tail! She smiles and says something in a foreign language… you feel drowsy and warm. You wake up tied up — being sacrificed to the Siren goddess! Game over.",
                "In your peaceful state, you fail to notice the giant bee that lands on you. Ouch! Game over."
            )
        );
    }

    public static Location createPixieHollow() {
        return new Location(
            "Pixie Hollow",
            "A secluded grove bathed in golden sunlight and dusted with sparkling magic. Tiny voices giggle just out of reach, and trails of glitter swirl through the air like fireflies. Mushrooms glow gently under curling ferns, and the air smells of honey and wildflowers. Pixie Hollow is dreamlike, whimsical—and unpredictable. A tiny voice offers you a glowing cupcake.",
            Arrays.asList("Eat the cupcake", "Follow a silver trail that leads deeper into the woods", "Sit quietly and observe the trails of glitter"),
            Arrays.asList(
                "You eat the glowing cupcake. Suddenly, you shrink to the size of a thimble! The pixies cheer and give you a sparkling puzzle piece.",
                "You follow the silver trail to a circle of dancing pixies. You join in… but time feels weird. You blink—and 50 years have passed. Game over",
                "You watch the lights. One gets too close and BOOM it explodes into glittery powder. Game over."
            )
        );
    }

    public static Location createIceLand() {
        return new Location(
            "Ice Land",
            "A land carved from ancient frost and forgotten storms. Jagged icicles dangle like knives from every branch, and the snow is knee-deep and whispering secrets. Blizzard winds dance through the frozen trees, and even the silence feels sharp. Ice Land is quiet, cold, and utterly beautiful—until it bites.",
            Arrays.asList("Break off an icicle hanging from the ancient tree", "Search for warmth before you freeze", "Build snowman for fun"),
            Arrays.asList(
                "You attempt to break off an icicle, but the whole tree cracks open! Inside is a block of ice... Containing a frozen puzzle piece!",
                "You reach a glowing cave… but you soon learn it is the den of a frost beast! Unfortunately you didn't learn soon enough. Game over. ",
                "You build a snowman. It opens its eyes: THANKS FOR FREEING ME! It takes all of your supplies and runs away. Game over."
            )
        );
    }

    public static Location createPirateCamp() {
        return new Location(
            "Pirate Camp",
            "The smell of rum and sea salt hangs heavy in this rugged camp by the cliffs. Torn sails flap in the breeze, and rough voices bark orders over clashing tankards. Half-buried treasure chests lie forgotten, and pirates argue over maps beside smoldering fires. The ground is littered with secrets—and maybe, rewards.",
            Arrays.asList("Join a group of pirates who are arm-wrestling", " Open the nearest chest with a skull carved on it", "Sneak into the captain's tent while no one is watching"),
            Arrays.asList(
                "You arm-wrestle the pirates, and win!They offer you a swig… you drink some, and you pass out instantly. You wake up on a rowboat, drifting alone. Game over.",
                "The hinges squeek, and inside is a dirty old puzzle piece!.",
                "You sneak into the captain's tent. Treasure! But a parrot screams: “THIEF!” Pirates run in and... Game over."
            )
        );
    }

    public static Location createDesert() {
        return new Location(
            "Desert",
            "Vast and unrelenting, the desert stretches endlessly under a white-hot sun. Waves of heat shimmer across golden dunes, and strange mirages flicker on the horizon. Bones bleach under the sand, and the wind carries stories in languages long forgotten. Here, the line between illusion and truth is dangerously thin.",
            Arrays.asList("Investigate a strange mirage in the distance", "Dig where you saw something glinting under the sand", "Climb the tallest dune to get a better view"),
            Arrays.asList(
                "You reach an oasis. It vanishes as you drink… You collapse. Something cool touches your hand. A carved puzzle piece buried in the sand!",
                "You dig and find an old oil lamp. You rub it. “Nap or slap?” the genie offers. You choose nap. You wake up 3 days later, sunburned and alone.",
                "You climb the tallest dune—breathtaking view! But just then, a sandstorm hits! Game over. "
            )
        );
    }
}
