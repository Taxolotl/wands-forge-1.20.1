def custom_replace(strinput, strword):
	return strinput.replace("$UPPER_REPLACE$", strword.upper()).replace("$lower_replace$", strword.lower()).replace("$Title_Replace$", strword.title())

def custom_replaced(replaceable):
	output = custom_replace(replaceable, "beechwood")
	output += custom_replace(replaceable, "ebony")
	output += custom_replace(replaceable, "holly")
	output += custom_replace(replaceable, "mahogany")
	output += custom_replace(replaceable, "maple")
	output += custom_replace(replaceable, "willow")
	output += custom_replace(replaceable, "yew")
	return output

replaceable = """\tpublic static final RegistryObject<Block> $UPPER_REPLACE$_LOG = registerBlock("$lower_replace$_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> $UPPER_REPLACE$_WOOD = registerBlock("$lower_replace$_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_$UPPER_REPLACE$_LOG = registerBlock("stripped_$lower_replace$_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_$UPPER_REPLACE$_WOOD = registerBlock("stripped_$lower_replace$_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> $UPPER_REPLACE$_PLANKS = registerBlock("$lower_replace$_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(3f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> $UPPER_REPLACE$_LEAVES = registerBlock("$lower_replace$_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> $UPPER_REPLACE$_SAPLING = registerBlock("$lower_replace$_sapling",
            () -> new SaplingBlock(new $Title_Replace$TreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> $UPPER_REPLACE$_SIGN = BLOCKS.register("$lower_replace$_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.$UPPER_REPLACE$));
    public static final RegistryObject<Block> $UPPER_REPLACE$_WALL_SIGN = BLOCKS.register("$lower_replace$_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.$UPPER_REPLACE$));
    public static final RegistryObject<Block> $UPPER_REPLACE$_HANGING_SIGN = BLOCKS.register("$lower_replace$_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.$UPPER_REPLACE$));
    public static final RegistryObject<Block> $UPPER_REPLACE$_WALL_HANGING_SIGN = BLOCKS.register("$lower_replace$_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.$UPPER_REPLACE$));
    public static final RegistryObject<Block> $UPPER_REPLACE$_STAIRS = registerBlock("$lower_replace$_stairs",
            () -> new StairBlock(() -> ModBlocks.$UPPER_REPLACE$_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModBlocks.$UPPER_REPLACE$_PLANKS.get())));
    public static final RegistryObject<Block> $UPPER_REPLACE$_SLAB = registerBlock("$lower_replace$_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.$UPPER_REPLACE$_PLANKS.get())));
	public static final RegistryObject<Block> $UPPER_REPLACE$_BUTTON = registerBlock("$lower_replace$_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> $UPPER_REPLACE$_PRESSURE_PLATE = registerBlock("$lower_replace$_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ModBlocks.$UPPER_REPLACE$_PLANKS.get()),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> $UPPER_REPLACE$_FENCE = registerBlock("$lower_replace$_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(ModBlocks.$UPPER_REPLACE$_PLANKS.get())));
    public static final RegistryObject<Block> $UPPER_REPLACE$_FENCE_GATE = registerBlock("$lower_replace$_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.$UPPER_REPLACE$_PLANKS.get()), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> $UPPER_REPLACE$_DOOR = registerBlock("$lower_replace$_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> $UPPER_REPLACE$_TRAPDOOR = registerBlock("$lower_replace$_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

"""

mod_blocks = open("ModBlocksWoods.txt", "w")
mod_blocks.write(custom_replaced(replaceable).rstrip())
mod_blocks.close()

replaceable = """\t\tthis.dropSelf(ModBlocks.$UPPER_REPLACE$_LOG.get());
        this.dropSelf(ModBlocks.$UPPER_REPLACE$_PLANKS.get());
        this.dropSelf(ModBlocks.$UPPER_REPLACE$_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_$UPPER_REPLACE$_WOOD.get());
        this.add(ModBlocks.$UPPER_REPLACE$_LEAVES.get(), block ->
                this.createOakLeavesDrops(block, ModBlocks.$UPPER_REPLACE$_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.$UPPER_REPLACE$_SAPLING.get());
        this.dropSelf(ModBlocks.$UPPER_REPLACE$_STAIRS.get());
        this.dropSelf(ModBlocks.$UPPER_REPLACE$_SLAB.get());
		this.add(ModBlocks.$UPPER_REPLACE$_SIGN.get(), block ->
                createSingleItemTable(ModItems.$UPPER_REPLACE$_SIGN.get()));
        this.add(ModBlocks.$UPPER_REPLACE$_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.$UPPER_REPLACE$_SIGN.get()));
        this.add(ModBlocks.$UPPER_REPLACE$_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.$UPPER_REPLACE$_HANGING_SIGN.get()));
        this.add(ModBlocks.$UPPER_REPLACE$_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.$UPPER_REPLACE$_HANGING_SIGN.get()));
		this.dropSelf(ModBlocks.$UPPER_REPLACE$_BUTTON.get());
		this.dropSelf(ModBlocks.$UPPER_REPLACE$_PRESSURE_PLATE.get());
		this.dropSelf(ModBlocks.$UPPER_REPLACE$_TRAPDOOR.get());
		this.dropSelf(ModBlocks.$UPPER_REPLACE$_FENCE.get());
		this.dropSelf(ModBlocks.$UPPER_REPLACE$_FENCE_GATE.get());
		this.add(ModBlocks.$UPPER_REPLACE$_SLAB.get(),
				block -> createSlabItemTable(ModBlocks.$UPPER_REPLACE$_SLAB.get()));
		this.add(ModBlocks.$UPPER_REPLACE$_DOOR.get(),
				block -> createDoorTable(ModBlocks.$UPPER_REPLACE$_DOOR.get()));

"""

mod_block_loot_tables = open("ModBlockLootTablesWoods.txt", "w")
mod_block_loot_tables.write(custom_replaced(replaceable).rstrip())
mod_block_loot_tables.close()


replaceable = """\t\tlogBlock(((RotatedPillarBlock) ModBlocks.$UPPER_REPLACE$_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.$UPPER_REPLACE$_WOOD.get()),
                blockTexture(ModBlocks.$UPPER_REPLACE$_LOG.get()),
                blockTexture(ModBlocks.$UPPER_REPLACE$_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get()),
                new ResourceLocation(Wands.MOD_ID, "block/stripped_$lower_replace$_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_$UPPER_REPLACE$_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get()));
        blockItem(ModBlocks.$UPPER_REPLACE$_LOG);
        blockItem(ModBlocks.$UPPER_REPLACE$_WOOD);
        blockItem(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG);
        blockItem(ModBlocks.STRIPPED_$UPPER_REPLACE$_WOOD);
        blockWithItem(ModBlocks.$UPPER_REPLACE$_PLANKS);
        leavesBlock(ModBlocks.$UPPER_REPLACE$_LEAVES);
        signBlock(((StandingSignBlock) ModBlocks.$UPPER_REPLACE$_SIGN.get()), ((WallSignBlock) ModBlocks.$UPPER_REPLACE$_WALL_SIGN.get()),
                blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        hangingSignBlock(ModBlocks.$UPPER_REPLACE$_HANGING_SIGN.get(), ModBlocks.$UPPER_REPLACE$_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        saplingBlock(ModBlocks.$UPPER_REPLACE$_SAPLING);
        stairsBlock(((StairBlock) ModBlocks.$UPPER_REPLACE$_STAIRS.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.$UPPER_REPLACE$_SLAB.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.$UPPER_REPLACE$_BUTTON.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.$UPPER_REPLACE$_PRESSURE_PLATE.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.$UPPER_REPLACE$_FENCE.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.$UPPER_REPLACE$_FENCE_GATE.get()), blockTexture(ModBlocks.$UPPER_REPLACE$_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.$UPPER_REPLACE$_DOOR.get()), modLoc("block/$lower_replace$_door_bottom"), modLoc("block/$lower_replace$_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.$UPPER_REPLACE$_TRAPDOOR.get()), modLoc("block/$lower_replace$_trapdoor"), true, "cutout");

"""

mod_block_state_provider = open("ModBlockStateProviderWoods.txt", "w")
mod_block_state_provider.write(custom_replaced(replaceable).rstrip())
mod_block_state_provider.close()

replaceable = """\t\tsimpleItem(ModItems.$UPPER_REPLACE$_SIGN);
        simpleItem(ModItems.$UPPER_REPLACE$_HANGING_SIGN);
        simpleItem(ModItems.$UPPER_REPLACE$_BOAT);
        simpleItem(ModItems.$UPPER_REPLACE$_CHEST_BOAT);
        saplingItem(ModBlocks.$UPPER_REPLACE$_SAPLING);
        evenSimplerBlockItem(ModBlocks.$UPPER_REPLACE$_STAIRS);
        evenSimplerBlockItem(ModBlocks.$UPPER_REPLACE$_SLAB);
        evenSimplerBlockItem(ModBlocks.$UPPER_REPLACE$_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.$UPPER_REPLACE$_PRESSURE_PLATE);
		simpleBlockItem(ModBlocks.$UPPER_REPLACE$_DOOR);
		trapdoorItem(ModBlocks.$UPPER_REPLACE$_TRAPDOOR);
		fenceItem(ModBlocks.$UPPER_REPLACE$_FENCE, ModBlocks.$UPPER_REPLACE$_PLANKS);
		buttonItem(ModBlocks.$UPPER_REPLACE$_BUTTON, ModBlocks.$UPPER_REPLACE$_PLANKS);

"""

mod_item_model_provider = open("ModItemModelProviderWoods.txt", "w")
mod_item_model_provider.write(custom_replaced(replaceable).rstrip())
mod_item_model_provider.close()

replaceable = """\t\tplanksFromLog(pWriter, ModBlocks.$UPPER_REPLACE$_PLANKS.get(), ModTags.Items.$UPPER_REPLACE$_LOGS, 4);
        woodFromLogs(pWriter, ModBlocks.$UPPER_REPLACE$_WOOD.get(), ModBlocks.$UPPER_REPLACE$_LOG.get());

"""

mod_recipe_provider = open("ModRecipeProviderWoods.txt", "w")
mod_recipe_provider.write(custom_replaced(replaceable).rstrip())
mod_recipe_provider.close()

replaceable = """\t\tevent.registerLayerDefinition(ModModelLayers.$UPPER_REPLACE$_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.$UPPER_REPLACE$_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);

"""

mod_event_bus_client_events = open("ModEventBusClientEventsWoods.txt", "w")
mod_event_bus_client_events.write(custom_replaced(replaceable).rstrip())
mod_event_bus_client_events.close()

replaceable = """\t\t\t\t\t\tpOutput.accept(ModBlocks.$UPPER_REPLACE$_LOG.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_$UPPER_REPLACE$_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_$UPPER_REPLACE$_WOOD.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_PLANKS.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_STAIRS.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_SLAB.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_FENCE.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_DOOR.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_BUTTON.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_LEAVES.get());
                        pOutput.accept(ModItems.$UPPER_REPLACE$_SIGN.get());
                        pOutput.accept(ModItems.$UPPER_REPLACE$_HANGING_SIGN.get());
                        pOutput.accept(ModItems.$UPPER_REPLACE$_BOAT.get());
                        pOutput.accept(ModItems.$UPPER_REPLACE$_CHEST_BOAT.get());
                        pOutput.accept(ModBlocks.$UPPER_REPLACE$_SAPLING.get());

"""

mod_creative_mode_tabs = open("ModCreativeModeTabsWoods.txt", "w")
mod_creative_mode_tabs.write(custom_replaced(replaceable).rstrip())
mod_creative_mode_tabs.close()

replaceable = """\tpublic static final RegistryObject<Item> $UPPER_REPLACE$_SIGN = ITEMS.register("$lower_replace$_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.$UPPER_REPLACE$_SIGN.get(), ModBlocks.$UPPER_REPLACE$_WALL_SIGN.get()));
    public static final RegistryObject<Item> $UPPER_REPLACE$_HANGING_SIGN = ITEMS.register("$lower_replace$_hanging_sign",
            () -> new HangingSignItem(ModBlocks.$UPPER_REPLACE$_HANGING_SIGN.get(), ModBlocks.$UPPER_REPLACE$_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
	public static final RegistryObject<Item> $UPPER_REPLACE$_BOAT = ITEMS.register("$lower_replace$_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.$UPPER_REPLACE$, new Item.Properties()));
    public static final RegistryObject<Item> $UPPER_REPLACE$_CHEST_BOAT = ITEMS.register("$lower_replace$_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.$UPPER_REPLACE$, new Item.Properties()));

"""

mod_items = open("ModItemsWoods.txt", "w")
mod_items.write(custom_replaced(replaceable).rstrip())
mod_items.close()

replaceable = """  "block.wands.$lower_replace$_leaves": "$Title_Replace$ Leaves",
  "block.wands.$lower_replace$_planks": "$Title_Replace$ Planks",
  "block.wands.$lower_replace$_log": "$Title_Replace$ Log",
  "block.wands.stripped_$lower_replace$_log": "Stripped $Title_Replace$ Log",
  "block.wands.$lower_replace$_wood": "$Title_Replace$ Wood",
  "block.wands.stripped_$lower_replace$_wood": "Stripped $Title_Replace$ Wood",
  "block.wands.$lower_replace$_sign": "$Title_Replace$ Sign",
  "block.wands.$lower_replace$_hanging_sign": "$Title_Replace$ Hanging Sign",
  "block.wands.$lower_replace$_sapling": "$Title_Replace$ Sapling",
  "block.wands.$lower_replace$_stairs": "$Title_Replace$ Stairs",
  "block.wands.$lower_replace$_slab": "$Title_Replace$ Slab",
  "block.wands.$lower_replace$_button": "$Title_Replace$ Button",
  "block.wands.$lower_replace$_pressure_plate": "$Title_Replace$ Pressure Plate",
  "block.wands.$lower_replace$_fence": "$Title_Replace$ Fence",
  "block.wands.$lower_replace$_fence_gate": "$Title_Replace$ Fence Gate",
  "block.wands.$lower_replace$_door": "$Title_Replace$ Door",
  "block.wands.$lower_replace$_trapdoor": "$Title_Replace$ Trapdoor",
  "item.wands.$lower_replace$_boat": "$Title_Replace$ Boat",
  "item.wands.$lower_replace$_chest_boat": "$Title_Replace$ Chest Boat",

"""

en_us_json = open("en_us.txt", "w")
en_us_json.write(custom_replaced(replaceable).rstrip())
en_us_json.close()

replaceable = "\t\t\t\t.add(ModBlocks.$UPPER_REPLACE$_FENCE.get())\n"

replaced = "\t\tthis.tag(BlockTags.FENCES)\n"
replaced += custom_replaced(replaceable).rstrip()
replaced += ";\n\n\t\tthis.tag(BlockTags.WOODEN_FENCES)\n"
replaced += custom_replaced(replaceable).rstrip()
replaced += ";\n\n\t\tthis.tag(BlockTags.FENCE_GATES)\n"

replaceable = "\t\t\t\t.add(ModBlocks.$UPPER_REPLACE$_FENCE_GATE.get())\n"

replaced += custom_replaced(replaceable).rstrip()
replaced += ";"

mod_block_tag_generator = open("ModBlockTagGeneratorWoods.txt", "w")
mod_block_tag_generator.write(replaced)
mod_block_tag_generator.close()