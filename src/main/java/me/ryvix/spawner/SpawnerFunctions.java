001    package org.bukkit.entity;
002    
003    import java.util.HashMap;
004    import java.util.Map;
005    
006    import org.bukkit.entity.minecart.HopperMinecart;
007    import org.bukkit.entity.minecart.SpawnerMinecart;
008    import org.bukkit.entity.minecart.RideableMinecart;
009    import org.bukkit.entity.minecart.ExplosiveMinecart;
010    import org.bukkit.entity.minecart.PoweredMinecart;
011    import org.bukkit.entity.minecart.StorageMinecart;
012    import org.bukkit.inventory.ItemStack;
013    import org.bukkit.Location;
014    import org.bukkit.World;
015    
016    public enum EntityType {
017    
018        // These strings MUST match the strings in nms.EntityTypes and are case sensitive.
019        /**
020         * An item resting on the ground.
021         * <p>
022         * Spawn with {@link World#dropItem(Location, ItemStack)}
023         * or {@link World#dropItemNaturally(Location, ItemStack)}
024         */
025        DROPPED_ITEM("Item", Item.class, 1, false),
026        /**
027         * An experience orb.
028         */
029        EXPERIENCE_ORB("XPOrb", ExperienceOrb.class, 2),
030        /**
031         * A leash attached to a fencepost.
032         */
033        LEASH_HITCH("LeashKnot", LeashHitch.class, 8),
034        /**
035         * A painting on a wall.
036         */
037        PAINTING("Painting", Painting.class, 9),
038        /**
039         * An arrow projectile; may get stuck in the ground.
040         */
041        ARROW("Arrow", Arrow.class, 10),
042        /**
043         * A flying snowball.
044         */
045        SNOWBALL("Snowball", Snowball.class, 11),
046        /**
047         * A flying large fireball, as thrown by a Ghast for example.
048         */
049        FIREBALL("Fireball", LargeFireball.class, 12),
050        /**
051         * A flying small fireball, such as thrown by a Blaze or player.
052         */
053        SMALL_FIREBALL("SmallFireball", SmallFireball.class, 13),
054        /**
055         * A flying ender pearl.
056         */
057        ENDER_PEARL("ThrownEnderpearl", EnderPearl.class, 14),
058        /**
059         * An ender eye signal.
060         */
061        ENDER_SIGNAL("EyeOfEnderSignal", EnderSignal.class, 15),
062        /**
063         * A flying experience bottle.
064         */
065        THROWN_EXP_BOTTLE("ThrownExpBottle", ThrownExpBottle.class, 17),
066        /**
067         * An item frame on a wall.
068         */
069        ITEM_FRAME("ItemFrame", ItemFrame.class, 18),
070        /**
071         * A flying wither skull projectile.
072         */
073        WITHER_SKULL("WitherSkull", WitherSkull.class, 19),
074        /**
075         * Primed TNT that is about to explode.
076         */
077        PRIMED_TNT("PrimedTnt", TNTPrimed.class, 20),
078        /**
079         * A block that is going to or is about to fall.
080         */
081        FALLING_BLOCK("FallingSand", FallingBlock.class, 21, false),
082        FIREWORK("FireworksRocketEntity", Firework.class, 22, false),
083        /**
084         * A placed boat.
085         */
086        BOAT("Boat", Boat.class, 41),
087        /**
088         * @see RideableMinecart
089         */
090        MINECART("MinecartRideable", RideableMinecart.class, 42),
091        /**
092         * @see StorageMinecart
093         */
094        MINECART_CHEST("MinecartChest", StorageMinecart.class, 43),
095        /**
096         * @see PoweredMinecart
097         */
098        MINECART_FURNACE("MinecartFurnace", PoweredMinecart.class, 44),
099        /**
100         * @see ExplosiveMinecart
101         */
102        MINECART_TNT("MinecartTNT", ExplosiveMinecart.class, 45),
103        /**
104         * @see HopperMinecart
105         */
106        MINECART_HOPPER("MinecartHopper", HopperMinecart.class, 46),
107        /**
108         * @see SpawnerMinecart
109         */
110        MINECART_MOB_SPAWNER("MinecartMobSpawner", SpawnerMinecart.class, 47),
111        CREEPER("Creeper", Creeper.class, 50),
112        SKELETON("Skeleton", Skeleton.class, 51),
113        SPIDER("Spider", Spider.class, 52),
114        GIANT("Giant", Giant.class, 53),
115        ZOMBIE("Zombie", Zombie.class, 54),
116        SLIME("Slime", Slime.class, 55),
117        GHAST("Ghast", Ghast.class, 56),
118        PIG_ZOMBIE("PigZombie", PigZombie.class, 57),
119        ENDERMAN("Enderman", Enderman.class, 58),
120        CAVE_SPIDER("CaveSpider", CaveSpider.class, 59),
121        SILVERFISH("Silverfish", Silverfish.class, 60),
122        BLAZE("Blaze", Blaze.class, 61),
123        MAGMA_CUBE("LavaSlime", MagmaCube.class, 62),
124        ENDER_DRAGON("EnderDragon", EnderDragon.class, 63),
125        WITHER("WitherBoss", Wither.class, 64),
126        BAT("Bat", Bat.class, 65),
127        WITCH("Witch", Witch.class, 66),
128        PIG("Pig", Pig.class, 90),
200        PIGBIKE("Pigbike",Pigbike.class, 67)
129        SHEEP("Sheep", Sheep.class, 91),
130        COW("Cow", Cow.class, 92),
131        CHICKEN("Chicken", Chicken.class, 93),
132        SQUID("Squid", Squid.class, 94),
133        WOLF("Wolf", Wolf.class, 95),
134        MUSHROOM_COW("MushroomCow", MushroomCow.class, 96),
135        SNOWMAN("SnowMan", Snowman.class, 97),
136        OCELOT("Ozelot", Ocelot.class, 98),
137        IRON_GOLEM("VillagerGolem", IronGolem.class, 99),
138        HORSE("EntityHorse", Horse.class, 100),
139        VILLAGER("Villager", Villager.class, 120),
140        ENDER_CRYSTAL("EnderCrystal", EnderCrystal.class, 200),
141        // These don't have an entity ID in nms.EntityTypes.
142        /**
143         * A flying splash potion.
144         */
145        SPLASH_POTION(null, ThrownPotion.class, -1, false),
146        /**
147         * A flying chicken egg.
148         */
149        EGG(null, Egg.class, -1, false),
150        /**
151         * A fishing line and bobber.
152         */
153        FISHING_HOOK(null, Fish.class, -1, false),
154        /**
155         * A bolt of lightning.
156         *
157         * Spawn with {@link World#strikeLightning(Location)}.
158         */
159        LIGHTNING(null, LightningStrike.class, -1, false),
160        WEATHER(null, Weather.class, -1, false),
161        PLAYER(null, Player.class, -1, false),
162        COMPLEX_PART(null, ComplexEntityPart.class, -1, false),
163        /**
164         * An unknown entity without an Entity Class
165         */
166        UNKNOWN(null, null, -1, false);
167    
168        private String name;
169        private Class<? extends Entity> clazz;
170        private short typeId;
171        private boolean independent, living;
172    
173        private static final Map<String, EntityType> NAME_MAP = new HashMap<String, EntityType>();
174        private static final Map<Short, EntityType> ID_MAP = new HashMap<Short, EntityType>();
175    
176        static {
177            for (EntityType type : values()) {
178                if (type.name != null) {
179                    NAME_MAP.put(type.name.toLowerCase(), type);
180                }
181                if (type.typeId > 0) {
182                    ID_MAP.put(type.typeId, type);
183                }
184            }
185        }
186    
187        private EntityType(String name, Class<? extends Entity> clazz, int typeId) {
188            this(name, clazz, typeId, true);
189        }
190    
191        private EntityType(String name, Class<? extends Entity> clazz, int typeId, boolean independent) {
192            this.name = name;
193            this.clazz = clazz;
194            this.typeId = (short) typeId;
195            this.independent = independent;
196            if (clazz != null) {
197                this.living = LivingEntity.class.isAssignableFrom(clazz);
198            }
199        }
200    
201        /**
202         *
203         * @deprecated Magic value
204         */
205        @Deprecated
206        public String getName() {
207            return name;
208        }
209    
210        public Class<? extends Entity> getEntityClass() {
211            return clazz;
212        }
213    
214        /**
215         *
216         * @deprecated Magic value
217         */
218        @Deprecated
219        public short getTypeId() {
220            return typeId;
221        }
222    
223        /**
224         *
225         * @deprecated Magic value
226         */
227        @Deprecated
228        public static EntityType fromName(String name) {
229            if (name == null) {
230                return null;
231            }
232            return NAME_MAP.get(name.toLowerCase());
233        }
234    
235        /**
236         *
237         * @deprecated Magic value
238         */
239        @Deprecated
240        public static EntityType fromId(int id) {
241            if (id > Short.MAX_VALUE) {
242                return null;
243            }
244            return ID_MAP.get((short) id);
245        }
246    
247        /**
248         * Some entities cannot be spawned using {@link World#spawnEntity(Location, EntityType)}
249         * or {@link World#spawn(Location, Class)}, usually
250         * because they require additional information in order to spawn.
251         *
252         * @return False if the entity type cannot be spawned
253         */
254        public boolean isSpawnable() {
255            return independent;
256        }
257    
258        public boolean isAlive() {
259            return living;
260        }
261    }
