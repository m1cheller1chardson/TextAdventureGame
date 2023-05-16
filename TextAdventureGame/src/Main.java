package com.techelevator.chooseyourownadventure;

import com.techelevator.chooseyourownadventure.out.production.chooseyourownadventure.PlayerCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);

        //OPENING TITLE
        System.out.println();
        System.out.println();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("The Stranger");
        System.out.println("at");
        System.out.println("the Bus Stop");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println();
        System.out.println();
        System.out.println("Type START to continue");
        System.out.print("> ");

        String startStr = input.nextLine();
        if(startStr.equalsIgnoreCase("start")){
            //START GAME
            System.out.println();

           //CHARACTER NAME
            System.out.println("------------------------------");
            System.out.println("Please enter a character name: ");
            System.out.println("------------------------------");
            System.out.print("> ");

            //STORED CHARACTER INFORMATION
            String characterName = input.nextLine();

            //INSTANTIATE CHARACTER
            PlayerCharacter Player = new PlayerCharacter(characterName, 100, 50, 55);

            //CHARACTER INFORMATION IN STRINGS - MAYBE DELETE/REWRITE
            String startingHealth = "Health: " + Player.getHealth() + "/100";
            String startingStamina = "Stamina: " + Player.getStamina() + "/100";
            String startingCredits = "Credits: " + Player.getCredits();

            //DISPLAY STATS
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" | " + characterName + " | " + startingHealth + " | " + startingStamina + " | " + startingCredits + " | ");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("You sit patiently waiting for the bus to arrive. The bus stop is empty, except for you and a stranger.");
            System.out.println("The bus arrives at the stop, and it's doors open, but there is no one inside except for the droid controlling the bus.");
            System.out.println("You notice the stranger staring at you intently, waiting for your move. Do you enter the bus or decide to walk home?");
            System.out.print("> ");

            //ENTER BUS OR WALK
            while (true) {
                String busOrNoBus = input.nextLine();
                if (busOrNoBus.toLowerCase().contains("enter")) {
                    System.out.println();
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("You stand and quickly make your way onto the bus, scanning your bus card as you enter.");
                    System.out.println("The machine makes a sudden beaming noise.");
                    System.out.println();
                    System.out.println("ERrOR!! yyOOuuURRRR CAAarrRDd hHasSs aA tTTtoO00TtaaAlll BallLaAnCe oO0f:");
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println("0 CrRReddIIttsS");
                    System.out.println("----------------");
                    System.out.println();
                    System.out.println("IIiinnssSuUUffFIiCCcieeEnnT fFUuUUnndDSs");
                    System.out.println("PPLlEASE iIInnserttT 10 cCREeeDDiiTTTss TtOo0 R1DdeeE");
                    System.out.println();
                    System.out.println("Insert credits or sneak past droid?");
                    System.out.print("> ");

                    //INSERT CREDITS
                    while(true) {
                        String creditsOrSneak = input.nextLine();
                        String creditsAfterBusStr = null;
                        String restedStamina = null;
                        if (creditsOrSneak.toLowerCase().contains("insert")) {
                            Player.setCredits(Player.getCredits() - 10);
                            creditsAfterBusStr = "Credits: " + Player.getCredits();

                            //DISPLAY UPDATED CREDITS
                            System.out.println();
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println(" | " + characterName + " | " + startingHealth + " | " + startingStamina + " | " + creditsAfterBusStr + " | ");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("CREDITS UPDATED");
                            System.out.println();
                            System.out.println("You insert credits and make your way over to an empty seat. You sit down and look up to see the Stranger whispering with the droid.");
                            System.out.println("The stranger inserts credits, walks to the seat next to you, and sits down. The stranger glares at you.");
                            System.out.println("Change seats or start a conversation with the Stranger?");
                            System.out.print("> ");

                            //CHANGE SEATS ON BUS
                            while (true) {
                                String changeSeatsOrStartConvo = input.nextLine();
                                if (changeSeatsOrStartConvo.toLowerCase().contains("change")) {
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("You stand up abruptly and cross the aisle to take a different seat.");
                                    System.out.println("The stranger is now staring at you even more intently than before.");
                                    System.out.println("Ignore or confront the stranger?");
                                    System.out.print("> ");

                                    //IGNORE STRANGER ON BUS
                                    while (true) {
                                        String ignoreOrConfrontStranger = input.nextLine();
                                        if (ignoreOrConfrontStranger.toLowerCase().contains("ignore")) {
                                            System.out.println("-------------------------------------------------------------------------------");
                                            System.out.println("You ignore the Stranger, turning your head towards the Droid.");
                                            System.out.println();
                                            System.out.println("Droid: ");
                                            System.out.println("AaTtEenNtTTiiOOnn PPAsSeeEnGerrsS");
                                            System.out.println("TtHhEe NneExXTt SSstTo0PP iIsS: ");
                                            System.out.println("MmeEtTroO DrrIve");
                                            System.out.println();
                                            System.out.println("You need to stay on the bus for another 8 stops before arriving to your destination. You open the music player on your phone.");
                                            System.out.println("What song would you like to listen to?");
                                            System.out.print("> ");

                                            //SONG SELECTION
                                            String songSelection = input.nextLine();
                                            System.out.println("-------------------------------------------------------------------------------");
                                            System.out.println("You begin listening to " + songSelection + " and nod your head to the beat.");
                                            System.out.println();
                                            System.out.println("Halfway through the song, your phone dies. You didn't realize the battery was low.");
                                            System.out.println("The bus is completely silent aside from the sound of the wheels turning. Tired from a long day at work, you close your eyes, and begin to fall into a heavy sleep...");
                                            System.out.println();
                                            System.out.println("Zzzzzzzzzzzzzzzzz");
                                            System.out.println();

                                            //WAKE UP
                                            System.out.println("You faintly hear the Droid announcing the next stop.");
                                            System.out.println("Should you wake up?");
                                            System.out.print("> ");
                                            String yesWakeUp = input.nextLine();
                                            System.out.println("Zzzzzzzzzzzzzzzzzzzzz");
                                            System.out.println();
                                            System.out.println(Player.getName() + ": " + yesWakeUp);

                                            //UPDATE STAMINA AFTER RESTING
                                            Player.setStamina(Player.getStamina() + 30);
                                            Player.setCredits(Player.getCredits() - 45);
                                            restedStamina = "Stamina: " + Player.getStamina() + "/100";
                                            String stolenCredits = "Credits: " + Player.getCredits() + "/100";
                                            System.out.println("-------------------------------------------------------------------------------");
                                            System.out.println(" | " + characterName + " | " + startingHealth + " | " + restedStamina + " | " + stolenCredits + " | ");
                                            System.out.println("-------------------------------------------------------------------------------");
                                            System.out.println("STAMINA UPDATED");
                                            System.out.println("CREDITS UPDATED");
                                            System.out.println();
                                            System.out.println("You begin to regain consciousness and catch the last part of the Droids announcement: ");
                                            System.out.println();
                                            System.out.println("xXTt SSstTo0PP iIsS: ");
                                            System.out.println("LlloowwRRyyYY LlAaaaNNeeE");
                                            System.out.println();
                                            System.out.println("You stand to get off the bus. As you look around the bus, you notice the Stranger is gone, along with the 45 credits you had in your pocket.");
                                            System.out.println("You let out a big sigh and walk home.");
                                            System.exit(1);
                                            break;

                                            //CONFRONT STRANGER ON BUS
                                        } else if (ignoreOrConfrontStranger.toLowerCase().contains("confront")) {
                                            System.out.println("-------------------------------------------------------------------------------");
                                            System.out.println("You confront the stranger and ask if they need something. The Stranger continues to glare at you.");
                                            System.out.println("Perplexed, you look away to gather your thoughts. You turn back to the Stranger to say something else, and you notice the stranger is no longer glaring at you.");
                                            System.out.println("Oddly, the Stranger seems to be glaring straight ahead. You notice a lack of emotion in the Strangers eyes.");
                                            System.out.println("You begin to panic, turning to the Droid for help, but when you look away from the Stranger, you realize you are no longer on the bus.");
                                            System.out.println("You are waiting at the bus stop.");
                                            System.exit(1);
                                            break;
                                        }
                                    }
                                    break;

                                    //START CONVERSATION ON BUS
                                } else if (changeSeatsOrStartConvo.toLowerCase().contains("start conversation")) {
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("You turn to the Stranger and extend your hand, saying: ");
                                    System.out.println("Hello! Can I help you with something? My name is " + characterName);
                                    System.out.println();
                                    System.out.println("The stranger looks down at your hand, and then back up at you. They say nothing, giving you a blank stare.");
                                    System.out.println("You stare back, keeping eye-contact for what seems like forever. Finally, you hear the Droid announce your stop: ");
                                    System.out.println();
                                    System.out.println("AaTtEenNtTTiiOOnn PPAsSeeEnGerrsS");
                                    System.out.println("TtHhEe NneExXTt SSstTo0PP iIsS: ");
                                    System.out.println("LlloowwRRyyYY LlAaaaNNeeE");
                                    System.out.println();

                                    //GET OFF AT STOP
                                    System.out.println("Should you get off at this stop?");
                                    System.out.print("> ");
                                    String yesGetOff = input.nextLine();
                                    System.out.println(Player.getName() + ": " + yesGetOff);
                                    System.out.println();
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("You raise your arm up to pull the rope, but before you can reach, you notice the Stranger move to pull the rope first.");
                                    System.out.println("You stand to get off the bus as it comes to a stop, keeping your eye on the Stranger before you exit the bus. The stranger, still glaring, stands.");
                                    System.out.println();
                                    System.out.println("You both move toward the front of the bus. The Stranger stands eerily still as the vehicle comes to a complete stop. The doors open, you turn to step out of the bus and onto the street.");
                                    System.out.println("You turn back around towards the bus, expecting to see the Stranger behind you, but all you see is the droid inside an empty bus.");
                                    System.out.println("You look around the street, still unable to find the Stranger. Confused and tired, you let out a big sigh and shrug, turn, and begin walking home.");
                                    System.out.println();
                                    System.exit(1);
                                    break;
                                }
                            }
                            break;

                            //SNEAK PAST DROID
                        } else if (creditsOrSneak.toLowerCase().contains("sneak")) {
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("You turn to take a step back, allowing the Stranger behind you to enter.");
                            System.out.println("In a brief moment of caution, you crouch behind the Stranger and sneak past the droid.");
                            System.out.println("You find a seat in the back of the bus, hidden from view of the driver.");
                            System.out.println();
                            System.out.println("Exhausted from a long day at work, your eyes begin to droop. You struggle to keep them open.");
                            System.out.println("Slowly, you begin to fall into a deep sleep.");
                            System.out.println();
                            System.out.println("Zzzzzzzzzzzzzzzzz");
                            System.out.println();

                            //WAKE UP
                            System.out.println("Should you wake up?");
                            System.out.print("> ");
                            String wakeUp = input.nextLine();
                            System.out.println();
                            System.out.println(Player.getName() + ": " + wakeUp);
                            System.out.println();

                            //UPDATE STAMINA AFTER RESTING
                            Player.setStamina(Player.getStamina() + 30);
                            String updatedStamina = "Stamina: " + Player.getStamina();
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println(" | " + characterName + " | " + startingHealth + " | " + updatedStamina + " | " + startingCredits + " | ");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("STAMINA UPDATED");
                            System.out.println();
                            System.out.println("You begin to regain consciousness. Opening your eyes, you realize you are no longer on the bus.");
                            System.out.println("You look around, confused. You realize you are back at the bus stop. You notice a Stranger standing across from you.");
                            System.exit(1);
                            break;
                        }
                    }

                    //WALK HOME
                } else if (busOrNoBus.toLowerCase().contains("walk")) {
                    Player.setStamina(Player.getStamina() - 10);
                    String walkingStamina = "Stamina: " + Player.getStamina() + "/100";
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println(" | " + characterName + " | " + startingHealth + " | " + walkingStamina + " | " + startingCredits + " | ");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("STAMINA UPDATED");
                    System.out.println();
                    System.out.println("You turn away from the bus stop and begin walking east. You notice the sky turning dark as rain begins to fall.");
                    System.out.println("You walk about half a mile from the bus stop, suddenly you sense a dreadful feeling looming over you.");
                    System.out.println("You take a glance over your shoulder, and notice the stranger has been following you.");
                    System.out.println("Confront the Stranger or try to get away?");
                    System.out.print("> ");

                    // CONFRONT STRANGER
                    while(true){
                        String confrontStrangerOrGetAway = input.nextLine();
                        if(confrontStrangerOrGetAway.toLowerCase().contains("confront")){
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("You turn to confront the stranger, yelling: ");
                            System.out.println("Hey, I remember you from the bus stop. Can I help you? Why are you following me?");
                            System.out.println();
                            System.out.println("The stranger begins to run toward you.");
                            System.out.println("Run or stand your ground?");
                            System.out.print("> ");

                            // RUN
                            while(true){
                                String runOrStandGround = input.nextLine();
                                if(runOrStandGround.toLowerCase().contains("run")){

                                    //UPDATE STAMINA AFTER RUNNING
                                    Player.setStamina(Player.getStamina() - 30);
                                    String staminaAfterRunning = "Stamina: " + Player.getStamina() + "/100";
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println(" | " + characterName + " | " + startingHealth + " | " + staminaAfterRunning + " | " + startingCredits + " | ");
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("STAMINA UPDATED");
                                    System.out.println();
                                    System.out.println("Instinctively, you turn to run. You run around the block, checking over your shoulder to see if the Stranger is still following.");
                                    System.out.println("You arrive to the corner where the bus stop is located. No one is around. You sit down to wait for the bus this time.");
                                    System.out.println("The bus arrives, you stand to enter the bus, but before you can step onto the platform, you sense something behind you.");
                                    System.out.println("Look behind?");
                                    System.out.print("> ");
                                    String lookBehind = input.nextLine();
                                    System.out.println();
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println(Player.getName() + ": " + lookBehind);
                                    System.out.println("You look over your shoulder to see the Stranger standing behind you.");
                                    System.exit(1);
                                    break;

                                    //STAND GROUND
                                } else if(runOrStandGround.toLowerCase().contains("stand ground")) {
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("You stand your ground. The Stranger suddenly stops running and stands very still. You are standing 10 feet apart.");
                                    System.out.println("You throw your arms up defensively in confusion, demanding: ");
                                    System.out.println("What would you like to say to the Stranger? ");
                                    System.out.print("> ");
                                    String standGroundStatement = input.nextLine();
                                    System.out.println();
                                    System.out.println("-------------------------------------------------------------------------------");
                                    System.out.println("You yell at the Stranger. ");
                                    System.out.println(Player.getName() + ": " + standGroundStatement);
                                    System.out.println();
                                    System.out.println("The stranger glares and says nothing.");
                                    System.exit(1);
                                    break;
                                }

                            } //GET AWAY
                            break;
                        } else if (confrontStrangerOrGetAway.toLowerCase().contains("get away")){

                            //UPDATE STAMINA AFTER RUNNING
                            Player.setStamina(Player.getStamina() - 30);
                            String staminaAfterRunning = "Stamina: " + Player.getStamina() + "/100";
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println(" | " + characterName + " | " + startingHealth + " | " + staminaAfterRunning + " | " + startingCredits + " | ");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("STAMINA UPDATED");
                            System.out.println();
                            System.out.println("Instinctively, you turn around and begin to run down to the end of the street. You see a different bus stop.");
                            System.out.println("You take a peak over your shoulder and notice the Stranger is gone.");
                            System.out.println();
                            System.out.println("The bus arrives, you stand to enter the bus, but stop immediately before entering. You notice something off about the driver.");
                            System.out.println("Look closer?");
                            System.out.print("> ");
                            String lookBehindAgain = input.nextLine();
                            System.out.println();
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("You look closer. You see the Stranger inside.");
                            System.exit(1);
                            break;
                        }
                    }
                    break;
                }
            }
        } else {
            System.out.println("Error. Exiting game.");
            System.exit(1);
        }

    }
}
