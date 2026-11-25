CREATE TABLE page_section_items (
    "id" UUID PRIMARY KEY,
    "sectionId" UUID NOT NULL,
    "sortOrder" INTEGER NOT NULL DEFAULT 0,
    "title" VARCHAR,
    "body" VARCHAR,
    "question" VARCHAR,
    "answer" VARCHAR,
    "deletedAt" TIMESTAMP,
    "createdAt" TIMESTAMP DEFAULT NOW(),
    "updatedAt" TIMESTAMP DEFAULT NOW(),
    CONSTRAINT "fk_page_section_items_sectionId" FOREIGN KEY ("sectionId") REFERENCES "page_sections" ("id")
);
CREATE INDEX "idx_page_section_items_sectionId" ON page_section_items ("sectionId", "sortOrder");
